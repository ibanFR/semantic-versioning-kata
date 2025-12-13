---
title: Continuous Integration
nav_order: 3
---

# Continuous Integration
{: .no_toc }


This project uses GitHub Actions for Continuous Integration and Continuous Deployment (CI/CD).

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}



## Java workflow

The `.github/workflows/java.yml` workflow is configured to automate the release process for the project when changes
are pushed to the `main` branch.

It checks out the code, runs Maven tests, and then uses `semantic-release` to publish a new release
to GitHub. 

It uses appropriate permissions for contents, issues, pull requests, and OIDC for provenance.

## .NET workflow

The `.github/workflows/dotnet.yml` workflow automates build, test, release, and NuGet package publishing for the 
`LiftButton` C# project.

It is triggered by push and pull request events targeting the `main` branch, and runs only when files within the `csharp/` directory are modified.

For more details on building and testing .NET projects with GitHub Actions, see the
[GitHub Actions Tutorial for Building and testing .NET projects].

## Pages workflow

The `.github/workflows/pages.yml` workflow is configured to automatically build and deploy the site documentation to
GitHub Pages whenever changes are pushed to the `main` branch.

[Using secrets in GitHub Actions]: https://docs.github.com/en/actions/security-for-github-actions/security-guides/using-secrets-in-github-actions
[GitHub Actions Tutorial for Building and testing .NET projects]: https://docs.github.com/en/actions/tutorials/build-and-test-code/net


