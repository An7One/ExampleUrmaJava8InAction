# Chapter 04 Introducing Streams

## Introduction

### 4.1 What are Streams?

<i>Streams</i> are an update to the Java API that lets you manipulate collections of data in a declarative way (one
expresses a query rather than code an ad hoc implementation for it).

The Streams API in Java 8 lets one write code that is

<ul>
    <li>Declarative</li>
    <li>Composable</li>
    <li>Parallelizable</li>
</ul>

### 4.2 Getting Started with Streams

To break down the definition of Streams "a sequence of elements from a source that supports data processing operations":
<ul>
    <li>Sequence of elements</li>
    <ul><li>Collections are about data; streams are about computations.</li></ul>
    <li>Source</li>
    <ul>
        <li>Streams consume from a data-providing source such as collections, arrays, or I/O resources.</li>
        <li>Generating a stream from an ordered collection preserves the ordering.</li>
    </ul>
    <li>Data processing operations</li>
    <ul>
        <li><code>collect</code>, to convert a stream into another form</li>
        <li><code>filter</code>, to take a lambda to exclude certain elements from the stream.</li>
        <li><code>map</code>, to take a lambda to transform an element into another one or to extract information.</li>
        <li><code>reduce</code>, to take a lambda to transform an element into another one or to extract information</li>
        <li><code>find</code></li>
        <li><code>limit</code>, to truncate a stream to contain no more than a given number of elements</li>
        <li>match</li>
        <li>sort</li>
        <li>so on...</li>
    </ul>
</ul>

Stream operations have 2 important characteristics:

<ol>
    <li>Pipelining</li>
    <ul>
        <li>allowing oeprations to be chained</li>
        <li>allowing certain optimizations, such as laziness and short-circuiting</li>
        <li>can be viewed as a database-like query on the data source</li>
    </ul>
    <li>Internal iteration</li>
    <ul>
        <li>in contrast to collections, explicitly iterating with iterators, stream operations do the iteration behind the scenes</li>
    </ul>
</ol>

### 4.3 Streams vs Collections

in coarsest terms, the difference is about <i>when</i> things are computed.

collection: stored in memory; elements have to be computed before becoming part of the collection

stream: a conceptually fixed data structure whose elements are computed on demand

#### 4.3.1 Traversable only once

#### 4.3.2 External vs internal iteration

## 4.4 Stream Operations

2 groups of operations:

<ul>
    <li>intermediate operations</li>
    <li>terminal operations</li>
</ul>

### 4.4.1 Intermediate Operations

Intermediate operations do not perform any processing until a terminal operation is invoked on the stream pipeline -
they are lazy.

### 4.4.2 Terminal Operations

### 4.4.3 Working With Streams

In general involves 3 items:

<ul>
    <li>a data source (such as a collection) to perform a query on</li>
    <li>a chain of <i>intermediate operations</i> that form a stream pipeline</li>
    <li>a <i>terminal operation</i> that executes the stream pipeline and produces a result</li>
</ul>

## 4.5 Summary