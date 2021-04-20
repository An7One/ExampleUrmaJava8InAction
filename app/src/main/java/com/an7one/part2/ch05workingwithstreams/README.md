# Chapter 05 Working with Streams

## Introduction

## 5.1 Filtering and Slicing

### 5.1.1 Filtering with a Predicate

### 5.1.2 Filtering Unique Elements

### 5.1.3 Truncating a Stream

### 5.1.4 Skipping Elements

## 5.2 Mapping

### 5.2.1 Applying a Function to Each Element of a Stream

### 5.2.2 Flattening Streams

#### Using <code>flatMap</code>

Using the <code>flatMap</code> has the effect of mapping each array not with a stream but with <i>the contents of that
stream</i>.

## 5.3 Finding and Matching

### 5.3.1 Checking to See if a Predicate Matches at least One Element

### 5.3.2 Checking to See if a Predicate Matches All Elements

<code>boolean isHealthy = menu.stream().allMatch(d -> d.getCalories() < 1000);</code>

#### <code>noneMatch</code>

<code>boolean isHealthy = menu.stream().noneMatch(d -> d.getCalories() >= 1000);</code>

Short-circuiting Evaluation

### 5.3.3 Finding an Element

<code>Optional<Dish> dish = menu.stream().filter(Dish::isVegetarian).findAny();</code>

#### <code>Optional</code> in a nutshell

### 5.3.4 Finding the First Element

## 5.4 Reducing

A stream is reduced to a value.

### 5.4.1 Summing the Elements

<code>reduce</code> takes two arguments

<ol>
    <li>an initial value</li>
    <li>a <code>BinaryOperator&lt;T&gt;</code> to combine two elements and produce a new value</li>
</ol>

<code>int sum = nums.stream().reduce(0, Integer::sum);</code>

#### No initial value

<code>Optional&lt;Integer&gt; sum = nums.stream().reduce((a, b) -> (a + b));

### 5.4.2 Maximum and Minimum

<code>Optional&lt;Integer&gt; max = nums.stream().reduce(Integer::max);</code>

<code>Optional&lt;Integer&gt; min = nums.stream().reduce(Integer::min);</code>

map-reduce pattern, a chain of <code>map</code> and <code>reduce</code>:</br>
<code>int count = menu.stream().map(d -> 1).reduce(0, (a, b) -> a + b);

#### Benefit of the reduce method and parallelism

#### Stream operations: stateless vs. stateful

## 5.5 Putting it All into Practice

## 5.6 Numeric Streams

### 5.6.1 Primitive Stream Specializations

#### Mapping to a numeric stream

#### Converting back to a stream of objects

#### Default values: <code>OptionalInt</code>6

### 5.6.2 Numeric Ranges

### 5.6.3 Putting Numerical Streams into Practice: Pythagorean Triples

#### Pythagorean triple

#### Representing a triple

#### Filtering good combinations

#### Generating tuples

#### Generating b values

#### Generating a values

#### Running the code

#### Can you do better?

## 5.7 Building Streams

### 5.7.1 Streams From Values

### 5.7.2 Streams From Arrays

### 5.7.3 Streams From Files

### 5.7.4 Streams From Functions: Creating Infiite Streams!

#### Iterate

#### Generate
