# Chapter 03 Lambda Expressions

## 3.1 Lambdas in a Nutshell

## 3.2 Where and How to Use Lambdas

### 3.2.1 Functional Interface

A functional interface specifies only one abstract method.

An interface is still a functional interface if it has many default methods as long as it specifies only one abstract
method.

The lambda expression provides an instance of a concrete implementation of the functional interface.

### 3.2.2 Function Descriptor

| Functional Interface | Functional Descriptor | Primitive Specialization |
| -------------------- | --------------------- | ------------------------ |
| <code>Predicate<T></code> | T -> boolean | IntPredicate, LongPredicate, DoublePredicate |

[Oracle Doc](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)

## 3.3 Putting Lambdas into Practice: the Execute Around Pattern

### 3.3.1 Step 1: Remember Behavior Parameterization

### 3.3.2 Step 2: Use a Functional Interface to Pass Behavior

### 3.3.3 Step 3: Execute a Behavior

### 3.3.4 Step 4: Pass Lambdas

## 3.4 Using Functional Interfaces

### 3.4.1 Predicate

### 3.4.2 Consumer

### 3.4.3 Function

#### Primitive specialization

| Use Case | Example of Lambda | Matching Functional Interface |
| -------- | ----------------- | ----------------------------- |
| A boolean expression | <code>(List<String> list) -> list.isEmpty() </code> | <code>Predicate<List<String> |

## 3.5 Type Checking, Type Inference, and Restrictions

### 3.5.1 Type Checking

The type-checking progress is deconstructed as follows:

<ol>
    <li>to look up the declaration of the <code>filter</code> method</li>
    <li>it expects as the 2nd formal paramter an object type <code>Predicate&lt;Apple&gt;</code>(the target type)</li>
    <li><code>Predicate&lt;Apple&gt;</code></li>
    <li>the method <code>test</code> describes a function descriptor that accepts an <code>Apple</code> and returns a boolean.</li>
    <li>any actual argument to the <code>filter</code> method needs to match this requirement</li>
</ol>

### 3.5.2 Same Lambda, Different Functional Interfaces

Because of the idea of <i>target typing</i>, the same lambda expression can be associated with different functional
interfaces if they have a compatible abstract method signature.

### 3.5.3 Type Inference

### 3.5.4 Using Local Variables

#### Restrictions on local variables

#### Closure

A closure is an instance of a function that can reference nonlocal variables of that function with on restrictions.

## 3.6 Method References

### 3.6.1 In a Nutshell

| Lambda | Method Reference Equivalent |
| ------ | ---------------------------- |
| <code>(Apple a) -> a.getWeight() | Apple::getWeight|
| | |

#### Recipe for constructing method references

3 main kinds of method references

<ol>
    <li>to a static method</li>
    <ul>eg.<li><code>Integer::parseInt</code></li></ul>
    <li>to an instance method of an arbitrary type</li>
    <ul>eg.<li><code>String::length</code></li></ul>
    <li>to an instance method of an existing object</li>
    <ul>eg.<li><code>expensiveTransaction::getValue</code></li></ul>
</ol>

### 3.6.2 Constructor References

## 3.7 Putting Lambdas and Method References into Practice

## 3.8 Useful Methods to Compose Lambda Expressions

## 3.9 Similar Ideas from Mathematics

## 3.10 Summary

