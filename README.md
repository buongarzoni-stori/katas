# FizzBuzz
## Stage 1 - Requirements
Problem Description
Imagine the scene. You are eleven years old, and in the five minutes before the end of the lesson, your Maths teacher decides he should make his class more “fun” by introducing a “game”. He explains that he is going to point at each pupil in turn and ask them to say the next number in sequence, starting from one. The “fun” part is that if the number is divisible by three, you instead say “Fizz” and if it is divisible by five you say “Buzz”. So now your maths teacher is pointing at all of your classmates in turn, and they happily shout “one!”, “two!”, “Fizz!”, “four!”, “Buzz!”… until he very deliberately points at you, fixing you with a steely gaze… time stands still, your mouth dries up, your palms become sweatier and sweatier until you finally manage to croak “Fizz!”. Doom is avoided, and the pointing finger moves on.

So of course in order to avoid embarassment infront of your whole class, you have to get the full list printed out so you know what to say. Your class has about 33 pupils and he might go round three times before the bell rings for breaktime. Next maths lesson is on Thursday. Get coding!

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz “.

Sample output:
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
... etc up to 100
```

## Stage 2 - new requirements
- A number is fizz if it is divisible by 3 or if it has a 3 in it
- A number is buzz if it is divisible by 5 or if it has a 5 in it

For exemple :

- 53 should return FizzBuzz (contain 5 and 3)
- 35 should return FizzBuzzBuzz (contain 3 and 5 and it divided by 5)

## Stage 3 - Service, Events and Toggles :D

We now need to switch our logic from our mobile application to a backend, this behaviour is going
to be controlled by a toggle called "fizzbuzz_service_call_enabled".

We also need to send the event "fizz_buzz_calculation" with the result to Amplitude and Braze.

For Braze we need the properties "number", "result", "origin" (mobile, server)

## Stage 4 - Extra
Create a Distance value object, like Duration.

# Links
[Kata](https://codingdojo.org/kata/FizzBuzz/)

[Pair Programming](https://storicard-espacio.slack.com/archives/C06CUHC6F5E/p1710518394909789)

[TDD - Martin Fowler](https://martinfowler.com/bliki/TestDrivenDevelopment.html)

[TDD - Mockista vs Clasista](https://romainbrunie.medium.com/mockist-v-classical-testing-strategy-d967f1bc263c)

[TDD - Duro de testear](https://www.youtube.com/watch?v=T5PGG784DOE)

[From Inline to Value Classes](https://www.youtube.com/watch?v=LpqvtgibbsQ)
