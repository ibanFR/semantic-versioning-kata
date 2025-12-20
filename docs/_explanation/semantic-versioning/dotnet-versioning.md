---
title: Versioning in .NET
parent: Semantic Versioning
nav_order: 1
---

# Versioning in .NET
{: .no_toc }

This document explains versioning strategies for .NET libraries.
{: .fs-6 .fw-300 }

For more information on the .NET platform versioning scheme, see [How .NET is versioned] in the official Microsoft 
documentation.

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

   
### Version number in C# projects

In the C# implementation of LiftButton, the version number is specified in the `LiftButton.csproj` file located in the
`csharp/` directory.

The format used is defined by .NET project files:

```xml
<Project Sdk="Microsoft.NET.Sdk">

    <PropertyGroup>
        <TargetFramework>net10.0</TargetFramework>
        <ImplicitUsings>enable</ImplicitUsings>
        <Nullable>enable</Nullable>
        <PackageId>IbanFR.SemanticRelease.LiftButton</PackageId>
        <Version>0.0.1-alpha</Version>
    </PropertyGroup>

</Project>
```

The `<Version>0.0.1-alpha</Version>` follows the SemVer 2.0 format and is updated automatically during the release
process using GitHub Actions.

Common pre-release labels such as `-alpha`, `-beta`, or `-rc` can be used to indicate pre-release versions before the
stable release.

[How .NET is versioned]: https://learn.microsoft.com/en-us/dotnet/core/versions/
