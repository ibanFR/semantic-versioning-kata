---
title: Home
layout: home
nav_order: 1
---

# Semantic Versioning Learning Hour
{: .no_toc }

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

Learn how to apply Semantic Versioning (SemVer) to automate software releases by working through the [Lift Button](
{% link _explanation/lift-button.md %})
Kata.

This Learning Hour will help you understand versioning principles and integrate them into your development
workflow.

## Session Outline

* 5 min connect: How are version numbers assigned for your software?
* 5 min concept: Semantic Versioning Specification
* 10 min concept: Semantic Release
* 20 min concrete: Release initial features for Lift Button
* 15 min concrete: Release a BREAKING CHANGE for Lift Button
* 5 min conclusions: What are the benefits of releasing on every commit?

## Connect: How are version numbers assigned for your software?

Discuss with the group how version numbers are currently assigned in your projects. Are they done manually or
automatically? What challenges have you faced with versioning?

## Concept: Semantic Versioning Specification

[Semantic Versioning] (SemVer) is a versioning scheme that consist in Simple set of rules and requirements that
dictate how version numbers are assigned and incremented for software releases.

SemVer uses a three-part version number - `MAJOR.MINOR.PATCH` - to communicate changes to the software with specific
increments to the version number:

- `MAJOR` version, increased for backwards incompatible changes.
- `MINOR` version, increased for new features/functionality in a backwards compatible manner.
- `PATCH` version, increased for backwards compatible bug fixes.

## Concept: Semantic Release

[Semantic Release] is a tool that automates the release process by analyzing commit messages to determine the type of
changes made in the codebase.

Contributors follow a specific commit message convention to indicate the nature of their changes:

```
<type>: <description>
<BLANK LINE>
<optional body>
<BLANK LINE>
<optional footer>
```

For example:

```conventionalcommit
feat: add lights() method to Lift class to query the light status
```

By using Semantic Release, teams can ensure consistent and reliable releases, reduce human error, and streamline the
release process.

## Concrete: Release initial features for Lift Button

After reviewing the requirements for the [Lift Button]({% link _explanation/lift-button.md %}), the team has come up 
with an initial Test list to implement the first features of the Lift Button:

```java
//TEST LIST
//[] - doors should be CLOSED when Lift is created
//[] - should switch lights ON when button is pressed and doors are CLOSED
//[] - should OPEN the lift doors when lift arrives
//[] - should switch OFF the lights when lift arrives
//[] - lights should be OFF when button is pressed AND doors are OPEN
```

Your task is to help the team implement the initial Lift Button features and automate the release process using Semantic
Release:

1. Start by [forking] or [duplicating] the [semantic-versioning-kata] repository.
2. Write one test at a time and document your changes using semantic commit messages:

    ```html
    | Type     | Description                          | 
    |----------|--------------------------------------|
    | feat     | A new feature                        |
    | fix      | A bug fix                            |
    | refactor | A behavior preserving change         |
    ```

3. New features and fixes are immediately available to the users after a commit is pushed to the main branch. View 
   your [repository's releases and tags] to see the published versions based on your commit messages.

## Concrete: Release a BREAKING CHANGE for Lift Button

Following the release of version `v1.y.z`, customers raised a safety concern: the lift doors should not be closed when
the lift is initialized!

As a result, the customers have requested a change so that the doors remain open upon lift creation. Here is the new
feature request:

```gherkin
Feature: Open doors on lift initialization
  
  As a safety-conscious user
  I want the lift doors to be open when the lift is first started
  So that I can ensure safe entry and exit from the lift

  Scenario: The one where the Lift is first started
    When the Lift is first started
    Then the Lift doors should be OPEN
```

This change requires users of version `v1.y.z` to update their code for compatibility with the new lift behavior, so 
the team will release this feature as a breaking change: 

1. Update the code to implement the new requirement and release a new version of the Lift Button.
2. Use the footer in your commit message to indicate that this change is not backwards compatible.

    ```
    <type>: <description>

    BREAKING CHANGE: <breaking change summary>
    <breaking change description + migration instructions>
    ```
3. After pushing your commit to the main branch, check your [repository's releases and tags] to see the new major 
   version created for the breaking change.

## Conclusions: What are the benefits of releasing on every commit?

Discuss the advantages of automating releases with Semantic Release. Is it really a good idea to release on every
commit? What benefits does it bring to your development workflow and team collaboration?


[Semantic Versioning]: https://semver.org/

[Semantic Release]: https://semantic-release.gitbook.io/semantic-release

[forking]: https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/working-with-forks/fork-a-repo#forking-a-repository

[duplicating]: https://docs.github.com/en/repositories/creating-and-managing-repositories/duplicating-a-repository

[semantic-versioning-kata]: https://github.com/ibanFR/semantic-versioning-kata

[repository's releases and tags]: https://docs.github.com/en/repositories/releasing-projects-on-github/viewing-your-repositorys-releases-and-tags