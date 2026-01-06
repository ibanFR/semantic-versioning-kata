---
title: Publishing a NuGet package
parent: Semantic Release
nav_order: 2
---

# Publishing a NuGet Package
{: .no_toc }

[NuGet] is the package manager for .NET. It is used by developers to create, share, and consume .NET libraries.
{: .fs-6 .fw-300 }

For more information about NuGet, see [An introduction to NuGet].

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## What is a package?

A package is a compiled library with its descriptive metadata.

## Add package metadata to project file

To publish a NuGet package, you need to add some metadata to your project file (`.csproj`). Here is an example of the
necessary properties to include:

```xml
<PropertyGroup>
    <PackageId>IbanFR.SemanticRelease.LiftButton</PackageId>
    <Version>0.1.0</Version>
    <Authors>Iván Fernández</Authors>
    <Company>IbanFR</Company>
    <Description>Csharp implementation of the LiftButton software</Description>
</PropertyGroup>
```

`PackageId` should be unique across NuGet.org. For example, you can prefix it with your GitHub username: `<PackageId>YourGitHubUsername.SemanticRelease.LiftButton</PackageId>`.


## Create a secret for the NuGet API key

- https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-secrets

## Create a NuGet package

See [Create a NuGet package with the dotnet CLI].

## Publishing a NuGet package

See [Publish NuGet packages].

## Other sources and inspiration

 - [.NET Package Management with NuGet for Beginners]
 - [Automating Releases of .NET SDKs using Semantic Release]

[NuGet]: https://www.nuget.org/
[An introduction to NuGet]: https://learn.microsoft.com/en-us/nuget/what-is-nuget
[Create a NuGet package with the dotnet CLI]: https://learn.microsoft.com/en-us/nuget/create-packages/creating-a-package-dotnet-cli
[Publish NuGet packages]: https://learn.microsoft.com/en-us/nuget/nuget-org/publish-a-package
[.NET Package Management with NuGet for Beginners]: https://learn.microsoft.com/en-us/shows/dotnet-package-management-with-nuget-for-beginners/
[Automating Releases of .NET SDKs using Semantic Release]: https://medium.com/@gpanga/automating-releases-of-net-sdks-using-semantic-release-e3df46013876
