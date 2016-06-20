# Models 2016 Program

The web page for the program of the [Models 2016 conference](http://models2016.irisa.fr/) is implemented with MDE technologies. A DSL allows general chairs and pc chairs to easily enter the information regarding the program. From this information, we generate a JSON file. We also developed a web page that basically reads the JSON file and generates a graphical representation of the program.

## Features

- A DSL, including an Xtext-based textual editor, to design the program of a conference (ressources, events, schedule of the events over the program, and assignement of ressources to the events)
- A generative approach to generate a JSON file specifically tailored for webpage
- An angular app including :
  - select favorite talks
  - export all talks to ics file
  - export favorite talks to ics file

## Implementation
The DSL is implemented with Xtext, and the generative approach is implemented with Kermeta and xtend, all included into the GEMOC studio (see [dsl](https://github.com/gbecan/models2016-program/tree/master/dsl) folder). The web page is implemented with Bootstrap and AngularJS (see [index.html](https://github.com/gbecan/models2016-program/blob/master/index.html), [css/program.css](https://github.com/gbecan/models2016-program/blob/master/css/program.css) and [js/program.js](https://github.com/gbecan/models2016-program/blob/master/js/program.js) files).
An example of the generated JSON file is available in [js/data.js](https://github.com/gbecan/models2016-program/blob/master/js/data.js) file.

## Metamodel

![alt text](https://github.com/diverse-project/models2016-program/raw/master/models2016.png "Conference Metamodel")
