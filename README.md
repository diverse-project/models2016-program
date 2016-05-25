# Models 2016 Program

The web page for the program of the [Models 2016 conference](http://models2016.irisa.fr/) is realized with MDE techniques. We developed a DSL that allow the chairs to easily enter the information of the program. From this information, we generate a JSON file. We also developed a web page that basically reads the JSON file and generates a graphical representation of the program.

## Features
- select favorite talks
- export all talks to ics file
- export favorite talks to ics file

## Implementation
The DSL is implemented with xtext and xtend (see [dsl](https://github.com/gbecan/models2016-program/tree/master/dsl) folder).
The web page is implemented with Bootstrap and AngularJS (see [index.html](https://github.com/gbecan/models2016-program/blob/master/index.html), [css/program.css](https://github.com/gbecan/models2016-program/blob/master/css/program.css) and [js/program.js](https://github.com/gbecan/models2016-program/blob/master/js/program.js) files).
An example of the generated JSON file is available in [js/data.js](https://github.com/gbecan/models2016-program/blob/master/js/data.js) file.

