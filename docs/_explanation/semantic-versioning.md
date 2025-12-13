---
title: Semantic Versioning
nav_order: 1
---

# Semantic Versioning
{: .no_toc }

This repository uses [Semantic Versioning] to manage the versioning of the LiftButton software.
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

See [Understand versioning of artifacts] Unit in [Implement a versioning strategy] Microsoft Training Module for more
details on common conventions for other ecosystems.

### Versioning in Java

In the Java implementation of LiftButton, the version number is specified in the `pom.xml` file located in the `java/` 
directory: 

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.ibanfr</groupId>
    <artifactId>semantic-release-kata</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>jar</packaging>
```

The `<version>0.0.1-SNAPSHOT</version>` follows the SemVer format and is updated automatically during the release process using GitHub
Actions.

### Versioning in C#

In the C# implementation of LiftButton, the version number is specified in the `LiftButton.csproj` file located in the
`csharp/` directory:

```xml
<Project Sdk="Microsoft.NET.Sdk">

    <PropertyGroup>
        <TargetFramework>net10.0</TargetFramework>
        <ImplicitUsings>enable</ImplicitUsings>
        <Nullable>enable</Nullable>
        <PackageId>IbanFR.SemanticRelease.LiftButton</PackageId>
        <Version>1.0.0</Version>
    </PropertyGroup>

</Project>
```

Similar to the Java implementation, the `<Version>1.0.0</Version>` follows the SemVer format and is updated automatically during
the release process using GitHub Actions.

[Semantic Versioning]: https://semver.org/
[Understand versioning of artifacts]: https://learn.microsoft.com/en-us/training/modules/implement-versioning-strategy/2-understand-versioning-of-artifacts
[Implement a versioning strategy]: https://learn.microsoft.com/en-us/training/modules/implement-versioning-strategy/
