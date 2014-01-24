# bad-deps

Bad deps is a clojure library designed to demonstrate this dependency
problem I'm having.

## Usage

Note the discrepency in the third run. Somehow the spec task is
causing migratus-lein's dependency to leak into the main project.

```
$ lein run
JAVA JDBC VERSION INFO
version=0.3.0-beta2

$ lein test

lein test bad-deps.core-test
JAVA JDBC VERSION INFO
version=0.3.0-beta2

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.

$ lein with-profile speclj spec
Performing task 'spec' with profile(s): 'speclj'
JAVA JDBC VERSION INFO
version=0.2.3
.

Finished in 0.00081 seconds
1 examples, 0 failures
```

## License

Copyright © 2014 Gary Fredericks

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
