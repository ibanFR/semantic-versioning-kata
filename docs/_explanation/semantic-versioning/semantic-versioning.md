---
title: Semantic Versioning
nav_order: 1
---

# Semantic Versioning
{: .no_toc }

The Lift Button software follows the [Semantic Versioning] 2.0.0 specification for managing its versions.
{: .fs-6 .fw-300 }

[Semantic Versioning] (SemVer) is a versioning scheme that consist in a simple set of rules and requirements that
dictate how version numbers are assigned and incremented for software releases.

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Declaring the public API

In this repository, the public API is declared through the public classes and methods exposed in the Java and C# implementations
of the LiftButton software.

Changes to these public interfaces are carefully managed to ensure that version increments
adhere to the SemVer guidelines.

## Semantic Versioning Scheme

SemVer uses a three-part version number - `MAJOR.MINOR.PATCH` - to communicate changes to the software with specific
increments to the version number:

- `MAJOR` version, incremented for backwards incompatible changes.
- `MINOR` version, incremented for new features/functionality in a backwards compatible manner.
- `PATCH` version, incremented for backwards compatible bug fixes.

## Language-specific Versioning

Each implementation of the LiftButton defines its version in the artifact metadata, following the conventions of its
respective ecosystem.

For learning more about versioning strategies, see [Implement a versioning strategy] Microsoft Training Module.


[Semantic Versioning]: https://semver.org/
[Understand versioning of artifacts]: https://learn.microsoft.com/en-us/training/modules/implement-versioning-strategy/2-understand-versioning-of-artifacts
[Implement a versioning strategy]: https://learn.microsoft.com/en-us/training/modules/implement-versioning-strategy/
