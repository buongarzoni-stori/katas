package com.stori.katas.components.animations

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable

private const val CONTENT_ANIMATION_DURATION = 250

@Composable
fun <S> AnimatedSlide(
    targetState: S,
    slideRightIf: (S) -> Boolean,
    content: @Composable() (AnimatedContentScope.(S) -> Unit)
) {
    AnimatedContent(
        targetState = targetState,
        label = "",
        transitionSpec = {
            if (slideRightIf(targetState)) {
                slideInHorizontally(
                    animationSpec = tween(CONTENT_ANIMATION_DURATION),
                    initialOffsetX = { fullWidth -> -fullWidth }
                ) togetherWith slideOutHorizontally(
                    animationSpec = tween(CONTENT_ANIMATION_DURATION),
                    targetOffsetX = { fullWidth -> fullWidth }
                )
            } else {
                slideInHorizontally(
                    animationSpec = tween(CONTENT_ANIMATION_DURATION),
                    initialOffsetX = { fullWidth -> fullWidth }
                ) togetherWith slideOutHorizontally(
                    animationSpec = tween(CONTENT_ANIMATION_DURATION),
                    targetOffsetX = { fullWidth -> -fullWidth }
                )
            }
        }
    ) {
        content(it)
    }
}
