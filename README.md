# Virginia - URL shortener

This is a template project for "Software testing" course labs.

## Students group

- Проценко Андрій | andriy.anatolich@gmail.com
- Севрук Артем | artem55660120072013@gmail.com
- Сергєєв Ігор | sergieievigor@gmail.com
- Андрюшечкіна Діана | diart7189@gmail.com

## Design document

The [design document](https://docs.google.com/document/d/1gAWzpEh81vb39Ry_k5u8iz_depPqdwQXO6_kp8J9lzA/edit) that
describes architecture and implementation details of this project.

### System structure

There are four modules:
- `auth` **authentication module** - creates new users, authenticates existing ones
- `data-store` - **data-store** - a key-value persistence storage
- `logic` - **business logic** - logic of URL shortening
- `rest` - **REST API** - a module that provides a REST API. [Micronaut] framework is already added
  to project dependencies. It simplifies creation of REST API and provides built-in JWT 
  authentication.

## Environment prerequisites

### Java
This is a Java project, so you will need an environment with installed [JDK] 15. For installation, 
you could use:


- [AdoptOpenJDK] on Windows

### IDE  
As IDE use [IntelliJ Idea Edu].

### Checkstyle
We use [checkstyle] to ensure coding standards. To get real-time detection in IDE you could use [Checkstyle-IDEA] 
plugin. We use Google rules (local copy `./config/checkstyle/checkstyle.xml`).

## How to start development

1. Clone this repo
2. Open the project directory in IntelliJ Idea Edu
3. Configure IDE code style settings
  
    1. Open `Settings`
    2. Go to `Editor` -> `Code Style` -> `Import Scheme`
       ![Settings screenshot](./media/code-style-import.png)
    3. Import scheme from `./config/idea/intellij-java-google-style.xml`

## Commit messages

Write commit messages accordingly by [7 rules of good commit messages].
  
[JDK]: https://en.wikipedia.org/wiki/Java_Development_Kit
[IntelliJ Idea Edu]: https://www.jetbrains.com/idea-edu/
[sdkman]: https://sdkman.io/
[AdoptOpenJDK]: https://adoptopenjdk.net/
[7 rules of good commit messages]: https://chris.beams.io/posts/git-commit/#seven-rules
[Micronaut]: https://micronaut.io/
[checkstyle]: https://checkstyle.org/
[Checkstyle-IDEA]: https://plugins.jetbrains.com/plugin/1065-checkstyle-idea
