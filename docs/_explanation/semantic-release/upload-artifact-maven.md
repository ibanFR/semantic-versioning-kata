---
title: Uploading artifacts to Maven Central
parent: Semantic Release
nav_order: 3
---

# Uploading artifacts to Maven Central
{: .no_toc }

The [Central Repository] is the world’s largest collection of Java and open source components, making it simple for
developers to publish, access, and share Java artifacts globally.
{: .fs-6 .fw-300 }

[Apache Maven] is a build tool for Java projects. Using a project object model (POM), Maven manages a project's
compilation, testing, and documentation.

For more information about Maven, see [What is Maven?].

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Sign in to the Central Repository

[Sign in] to the Central Repository using your Sonatype account. If you don't have an account, you can create one 
for free or sign in using your GitHub, Google, or LinkedIn account.

## Choose a namespace

Before you can upload artifacts, you need to create a namespace (also known as a group ID) for your project. 

If you have signed up with your GitHub account, Sonatype has automatically created a namespace for you based on your
GitHub username. For example, if your GitHub username is `johnDoe`, you could use `io.github.johnDoe` as your group ID.

You can use this namespace or create a new one. See [Register a Namespace] for more information.


## Other sources and inspiration

- https://maven.apache.org/repository/guide-central-repository-upload.html
- https://docs.github.com/en/actions/tutorials/publish-packages/publish-java-packages-with-maven

[Central Repository]: https://central.sonatype.org/pages/about/
[Apache Maven]: https://maven.apache.org/
[What is Maven?]: https://maven.apache.org/what-is-maven.html
[Sign in]: https://central.sonatype.com/
[Register a Namespace]: https://central.sonatype.org/register/namespace/