# ballofmud
Demo code for reproducing static analysis quirk in IntelliJ Idea Ultimate

The code builds and runs well, however, static analysis of IntelliJ flags the wrong type of name. It's just a quirk in resolving the names overload, however it's very painful in our production code (which we are not in power to change, because we are not brave enough to touch that code and ship it to production)

![Screenshot of error in static analysis - "name" is marked as error](ball-of-mud-static-analysis-error.png?raw=true "Screenshot of error in static analysis")
