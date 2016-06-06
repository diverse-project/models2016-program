var data = [
	{
		"name" : "Sunday, Oct 2, 2016",
		"rooms" : [
			{
				"name" : "Rotonde Surcouf"
			},
			{
				"name" : "Rotonde J. Cartier"
			},
			{
				"name" : "Bouvet 1",
				"capacity" : 45
			},
			{
				"name" : "Bouvet 2",
				"capacity" : 45
			},
			{
				"name" : "Charcot",
				"capacity" : 54
			},
			{
				"name" : "Vauban 1",
				"capacity" : 50
			},
			{
				"name" : "Vauban 2",
				"capacity" : 60
			},
			{
				"name" : "Lamennais 1",
				"capacity" : 80
			},
			{
				"name" : "Lamennais 2",
				"capacity" : 80
			},
			{
				"name" : "Lamennais 3",
				"capacity" : 80
			}
		],
		"sessionGroups" : [
			[
				{
					"start" : "09:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T070000Z",
					"icalEnd" : "20161002T083000Z",
					"room" : "Bouvet 1",
					"events" : [
						{
							"type" : "DoctoralSymposium",
							"title" : "Doctoral Symposium",
							"organizers" : [
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T070000Z",
					"icalEnd" : "20161002T083000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Advanced Model Management with Epsilon",
							"abstract" : "Model management in MDE is all about manipulating models: transforming them, checking that they satisfy constraints, updating them, etc. This tutorial will focus on advanced model management – moving beyond simply building and executing transformations or constraints – illustrated with the Eclipse Epsilon platform. The tutorial will include a brief introduction to the principles and architecture of the Epsilon platform, especially its extensibility features. It will then illustrate advanced features, including developing new Epsilon languages, using annotations, extension via grammars, and developing new drivers.",
							"organizers" : [
								{
									"name" : "Richard Paige"	
								},
								{
									"name" : "Dimitris Kolovos"	
								},
								{
									"name" : "Antonio Garcia-Dominguez"	
								},
								{
									"name" : "Nicholas Matragkas"	
								},
								{
									"name" : "Horacio Hoyos"	
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T070000Z",
					"icalEnd" : "20161002T083000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "ARCADIA in a Nutshell",
							"abstract" : "The ARCADIA/Capella Domain Specific Modeling Language (DSML) is inspired by UML/SysML and NAF standards, and shares many concepts with these languages. It is the result of an iterative definition process driven by systems and software architects working in a broad spectrum of business domains (transportation, avionics, space, radar, etc.). It enforces an approach structured on successive engineering phases which establishes clear separation between needs (operational need analysis and system need analysis) and solutions (logical and physical architectures), in accordance with the IEEE 1220 standard. The Capella workbench is an Eclipse application (Polarsys project) implementing the ARCADIA method providing both a DSML and a dedicated toolset. This tutorial will demonstrate the benefits of using both ARCADIA and Capella on a simple case study. It will guide you into the first steps of using ARCADIA, starting with the Analysis levels of the case study. It will then show you how the Capella tool, with the help of the ARCADIA method, will help you design more efficiently both Logical and Physical Architectures.",
							"organizers" : [
								{
									"name" : "Pascal Roques"	
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T070000Z",
					"icalEnd" : "20161002T083000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Hybrid Graphical/Textual Modelling and Code Generation with PapyrusRT",
							"abstract" : "Many MDE tools rely on graphical notations to design models but in recent years there has been an increased interest in textual and mixed graphical/textual approaches to modelling. In this tutorial we present mixed graphical/textual modelling in PapyrusRT, an open-source industrial-strength modelling development environment for real-time and embedded systems based on the UML-RT language. We also introduce the tool’s code generator and present how to customize and extend the code generator, for example to provide code instrumentation or generate alternative code patterns. We will illustrate the tool with an extension of the code generator that enables web-based simulation and monitoring and model animation of an Arduino board model.",
							"organizers" : [
								{
									"name" : "Ernesto Posse"	
								},
								{
									"name" : "Nicolas Hili"	
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T070000Z",
					"icalEnd" : "20161002T083000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "ME",
							"abstract" : "Software artefacts constantly increase in complexity, variety and novelty. Environment and business constraints, user requirements and new insights put additional pressure on their adaptability, availability, reliability and quality: they continuously need to be up to date and up to level. However, evolution issues are critical, complex and costly to manage. They concern requirements, architecture, design, source code, documentation, integration as well as deployment. They also typically affect various kinds of models (data, behavioural, domain, source code or goal models). Addressing and managing these varieties of changes is essential. Models and meta-models, the cornerstone of complex software systems’ abstraction, represent a powerful mean for facing software evolution challenges by ensuring a more abstract and expressive modelling of software evolution. They can help and guide software evolution, and can enforce and reduce critical risks and important involved resources. The workshop puts the focus on Models and Evolution by considering two main sides:\n(1) Managing software evolution needs by relying on the high-level abstraction power of models and meta-models.\n(2) Managing models and metamodels evolution needs by putting attention to their increasing evolution issues as they become primary artefacts and to the need of co-evolution of all related software artefacts.",
							"url" : "http://www.models-and-evolution.com/",
							"organizers" : [
								{
									"name" : "Dalila Tamzalit",
									"email" : "Dalila.Tamzalit@univnantes.fr"
								},
								{
									"name" : "Alfonso Pierantonio",
									"email" : "alfonso.pierantonio@univaq.it"
								},
								{
									"name" : "Bernhard Schätz",
									"email" : "schaetz@fortiss.org"
								},
								{
									"name" : "Tanja Mayerhofer",
									"email" : "mayerhofer@big.tuwien.ac.at"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T070000Z",
					"icalEnd" : "20161002T083000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "OCL",
							"abstract" : "Limitations of graphical notations encourage the development of text-based modeling languages that either integrate with or replace graphical notations for modeling. Typical examples of such languages are OCL, textual MOF, Epsilon, and Alloy. The goal of this workshop is to create a forum where researchers and practitioners interested in building models using OCL or other kinds of textual languages can directly interact, report advances, share results, discuss appropriate standards and showcase tools on any aspect of textual modeling and analysis.",
							"url" : "http://oclworkshop.github.io/2016/",
							"organizers" : [
								{
									"name" : "Achim D. Brucker",
									"email" : "a.brucker@sheffield.ac.uk"
								},
								{
									"name" : "Jordi Cabot",
									"email" : "jordi.cabot@icrea.cat"
								},
								{
									"name" : "Adolfo Sanchez-Barbudo Herrera",
									"email" : "asbh500@cs.york.uk"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T070000Z",
					"icalEnd" : "20161002T083000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "FlexMDE",
							"abstract" : "Over the last years, numerous modeling platforms have been developed to simplify and automate many steps of Model Driven Engineering (MDE) processes. However, still several challenges have to be solved for enabling a wider adoption of MDE. One of the most important impediments in adopting MDE tools is related to the reduced flexibility of existing modeling platforms that do not permit to relax or enforce their rigidity depending on the stages of the applied development process. For instance, EMF does not permit to enter models which are not conforming to a metamodel. On one hand this allows only valid models to be defined, but on the other, it makes the corresponding pragmatics more difficult. Thus there is an increasing need for techniques supporting flexibility in a wide range of modeling activities, including metamodel, model, and model transformation development and reuse. The workshop aims at identifying the difficulties in the current practice of MDE related to the lack of flexibility, and soliciting contributions of ideas, concepts, and techniques also from other areas of software development which could be useful to revise certain MDE fundamental typing concepts, to facilitate flexible reuse of MDE artefacts, and to define agile model sketching techniques.",
							"url" : "http://www.di.univaq.it/flexmde/",
							"organizers" : [
								{
									"name" : "Davide Di Ruscio",
									"email" : "davide.diruscio@univaq.it"
								},
								{
									"name" : "Alfonso Pierantonio",
									"email" : "alfonso.pierantonio@univaq.it"
								},
								{
									"name" : "Juan De Lara",
									"email" : "Juan.deLara@uam.es"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T070000Z",
					"icalEnd" : "20161002T083000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "VOLT",
							"abstract" : "Model transformations are everywhere in software development, implicitly or explicitly. They have been described as “the heart and soul of Model-Driven Development (MDD)”. Several experts have identified the verification of model transformations as one of the grand challenges of MDD. Despite some recent activity in the field, the work on the verification of model transformations remains scattered and a clear perspective on the subject is still not in sight. Furthermore, current model transformation tools most often lack verification techniques to support such activities. The Fifth International Workshop on the Verification Of modeL Transformation is one of the most accurate venues to offer researchers a dedicated forum to classify, discuss, propose, and advance verification techniques dedicated to model transformations. VOLT promotes discussions between theoreticians and practitioners from academy and industry, given its ideal co-location with MODELS. VOLT’s interest spans both to academic and industrial practices. One of the goals of the forum is to collect enough industrial case studies so that those problems can be stated at a theoretical level.",
							"url" : "http://www-ens.iro.umontreal.ca/~syriani/volt2016/",
							"organizers" : [
								{
									"name" : "Moussa Amrani",
									"email" : "moussa.amrani@unamur.be"
								},
								{
									"name" : "Eugene Syriani",
									"email" : "syriani@iro.umontreal.ca"
								}
							]
						}
					]
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "10:30",
					"rowSpan" : 2
				},
				{
					"start" : "10:30",
					"end" : "11:00",
					"rowSpan" : 2,
					"icalStart" : "20161002T083000Z",
					"icalEnd" : "20161002T090000Z",
					"room" : "Rotonde Surcouf",
					"events" : [
						{
							"type" : "CoffeeBreak",
							"title" : "Coffee Break"
						}
					]
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				}
			],
			[],
			[
				{
					"start" : "11:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T090000Z",
					"icalEnd" : "20161002T103000Z",
					"room" : "Bouvet 1",
					"events" : [
						{
							"type" : "DoctoralSymposium",
							"title" : "Doctoral Symposium",
							"organizers" : [
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T090000Z",
					"icalEnd" : "20161002T103000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Advanced Model Management with Epsilon",
							"abstract" : "Model management in MDE is all about manipulating models: transforming them, checking that they satisfy constraints, updating them, etc. This tutorial will focus on advanced model management – moving beyond simply building and executing transformations or constraints – illustrated with the Eclipse Epsilon platform. The tutorial will include a brief introduction to the principles and architecture of the Epsilon platform, especially its extensibility features. It will then illustrate advanced features, including developing new Epsilon languages, using annotations, extension via grammars, and developing new drivers.",
							"organizers" : [
								{
									"name" : "Richard Paige"	
								},
								{
									"name" : "Dimitris Kolovos"	
								},
								{
									"name" : "Antonio Garcia-Dominguez"	
								},
								{
									"name" : "Nicholas Matragkas"	
								},
								{
									"name" : "Horacio Hoyos"	
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T090000Z",
					"icalEnd" : "20161002T103000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "ARCADIA in a Nutshell",
							"abstract" : "The ARCADIA/Capella Domain Specific Modeling Language (DSML) is inspired by UML/SysML and NAF standards, and shares many concepts with these languages. It is the result of an iterative definition process driven by systems and software architects working in a broad spectrum of business domains (transportation, avionics, space, radar, etc.). It enforces an approach structured on successive engineering phases which establishes clear separation between needs (operational need analysis and system need analysis) and solutions (logical and physical architectures), in accordance with the IEEE 1220 standard. The Capella workbench is an Eclipse application (Polarsys project) implementing the ARCADIA method providing both a DSML and a dedicated toolset. This tutorial will demonstrate the benefits of using both ARCADIA and Capella on a simple case study. It will guide you into the first steps of using ARCADIA, starting with the Analysis levels of the case study. It will then show you how the Capella tool, with the help of the ARCADIA method, will help you design more efficiently both Logical and Physical Architectures.",
							"organizers" : [
								{
									"name" : "Pascal Roques"	
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T090000Z",
					"icalEnd" : "20161002T103000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Hybrid Graphical/Textual Modelling and Code Generation with PapyrusRT",
							"abstract" : "Many MDE tools rely on graphical notations to design models but in recent years there has been an increased interest in textual and mixed graphical/textual approaches to modelling. In this tutorial we present mixed graphical/textual modelling in PapyrusRT, an open-source industrial-strength modelling development environment for real-time and embedded systems based on the UML-RT language. We also introduce the tool’s code generator and present how to customize and extend the code generator, for example to provide code instrumentation or generate alternative code patterns. We will illustrate the tool with an extension of the code generator that enables web-based simulation and monitoring and model animation of an Arduino board model.",
							"organizers" : [
								{
									"name" : "Ernesto Posse"	
								},
								{
									"name" : "Nicolas Hili"	
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T090000Z",
					"icalEnd" : "20161002T103000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "ME",
							"abstract" : "Software artefacts constantly increase in complexity, variety and novelty. Environment and business constraints, user requirements and new insights put additional pressure on their adaptability, availability, reliability and quality: they continuously need to be up to date and up to level. However, evolution issues are critical, complex and costly to manage. They concern requirements, architecture, design, source code, documentation, integration as well as deployment. They also typically affect various kinds of models (data, behavioural, domain, source code or goal models). Addressing and managing these varieties of changes is essential. Models and meta-models, the cornerstone of complex software systems’ abstraction, represent a powerful mean for facing software evolution challenges by ensuring a more abstract and expressive modelling of software evolution. They can help and guide software evolution, and can enforce and reduce critical risks and important involved resources. The workshop puts the focus on Models and Evolution by considering two main sides:\n(1) Managing software evolution needs by relying on the high-level abstraction power of models and meta-models.\n(2) Managing models and metamodels evolution needs by putting attention to their increasing evolution issues as they become primary artefacts and to the need of co-evolution of all related software artefacts.",
							"url" : "http://www.models-and-evolution.com/",
							"organizers" : [
								{
									"name" : "Dalila Tamzalit",
									"email" : "Dalila.Tamzalit@univnantes.fr"
								},
								{
									"name" : "Alfonso Pierantonio",
									"email" : "alfonso.pierantonio@univaq.it"
								},
								{
									"name" : "Bernhard Schätz",
									"email" : "schaetz@fortiss.org"
								},
								{
									"name" : "Tanja Mayerhofer",
									"email" : "mayerhofer@big.tuwien.ac.at"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T090000Z",
					"icalEnd" : "20161002T103000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "OCL",
							"abstract" : "Limitations of graphical notations encourage the development of text-based modeling languages that either integrate with or replace graphical notations for modeling. Typical examples of such languages are OCL, textual MOF, Epsilon, and Alloy. The goal of this workshop is to create a forum where researchers and practitioners interested in building models using OCL or other kinds of textual languages can directly interact, report advances, share results, discuss appropriate standards and showcase tools on any aspect of textual modeling and analysis.",
							"url" : "http://oclworkshop.github.io/2016/",
							"organizers" : [
								{
									"name" : "Achim D. Brucker",
									"email" : "a.brucker@sheffield.ac.uk"
								},
								{
									"name" : "Jordi Cabot",
									"email" : "jordi.cabot@icrea.cat"
								},
								{
									"name" : "Adolfo Sanchez-Barbudo Herrera",
									"email" : "asbh500@cs.york.uk"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T090000Z",
					"icalEnd" : "20161002T103000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "FlexMDE",
							"abstract" : "Over the last years, numerous modeling platforms have been developed to simplify and automate many steps of Model Driven Engineering (MDE) processes. However, still several challenges have to be solved for enabling a wider adoption of MDE. One of the most important impediments in adopting MDE tools is related to the reduced flexibility of existing modeling platforms that do not permit to relax or enforce their rigidity depending on the stages of the applied development process. For instance, EMF does not permit to enter models which are not conforming to a metamodel. On one hand this allows only valid models to be defined, but on the other, it makes the corresponding pragmatics more difficult. Thus there is an increasing need for techniques supporting flexibility in a wide range of modeling activities, including metamodel, model, and model transformation development and reuse. The workshop aims at identifying the difficulties in the current practice of MDE related to the lack of flexibility, and soliciting contributions of ideas, concepts, and techniques also from other areas of software development which could be useful to revise certain MDE fundamental typing concepts, to facilitate flexible reuse of MDE artefacts, and to define agile model sketching techniques.",
							"url" : "http://www.di.univaq.it/flexmde/",
							"organizers" : [
								{
									"name" : "Davide Di Ruscio",
									"email" : "davide.diruscio@univaq.it"
								},
								{
									"name" : "Alfonso Pierantonio",
									"email" : "alfonso.pierantonio@univaq.it"
								},
								{
									"name" : "Juan De Lara",
									"email" : "Juan.deLara@uam.es"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T090000Z",
					"icalEnd" : "20161002T103000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "VOLT",
							"abstract" : "Model transformations are everywhere in software development, implicitly or explicitly. They have been described as “the heart and soul of Model-Driven Development (MDD)”. Several experts have identified the verification of model transformations as one of the grand challenges of MDD. Despite some recent activity in the field, the work on the verification of model transformations remains scattered and a clear perspective on the subject is still not in sight. Furthermore, current model transformation tools most often lack verification techniques to support such activities. The Fifth International Workshop on the Verification Of modeL Transformation is one of the most accurate venues to offer researchers a dedicated forum to classify, discuss, propose, and advance verification techniques dedicated to model transformations. VOLT promotes discussions between theoreticians and practitioners from academy and industry, given its ideal co-location with MODELS. VOLT’s interest spans both to academic and industrial practices. One of the goals of the forum is to collect enough industrial case studies so that those problems can be stated at a theoretical level.",
							"url" : "http://www-ens.iro.umontreal.ca/~syriani/volt2016/",
							"organizers" : [
								{
									"name" : "Moussa Amrani",
									"email" : "moussa.amrani@unamur.be"
								},
								{
									"name" : "Eugene Syriani",
									"email" : "syriani@iro.umontreal.ca"
								}
							]
						}
					]
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "12:30",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "12:30",
					"end" : "14:00",
					"rowSpan" : 6,
					"icalStart" : "20161002T103000Z",
					"icalEnd" : "20161002T120000Z",
					"room" : "Rotonde J. Cartier",
					"events" : [
						{
							"type" : "Lunch",
							"title" : "Lunch"
						}
					]
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "14:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T120000Z",
					"icalEnd" : "20161002T133000Z",
					"room" : "Bouvet 1",
					"events" : [
						{
							"type" : "DoctoralSymposium",
							"title" : "Doctoral Symposium",
							"organizers" : [
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T120000Z",
					"icalEnd" : "20161002T133000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Modeling Reactive Systems with the Scenario Modeling Language and ScenarioTools",
							"abstract" : "Software-intensive systems in many domains consist of multiple cooperating reactive components. The distributed and concurrent nature of these systems makes the software development difficult. Key to avoiding the costly iterations is having a precise and consistent specification. In this tutorial, we present a powerful formal, scenario-based method for modeling reactive system specifications. Software engineers can specify the inter-component behavior by a set of scenarios. Each scenario describes what the system must or must not do in a certain situation and in reaction to certain events. This fits how engineers conceive and communicate the behavior during the early design. Specifications can be executed, which allows engineers to understand the interplay of the scenarios. Inconsistencies can be detected through formal synthesis algorithms. For curious beginners, but also for experienced reactive systems modelers, we introduce scenario-based modeling and give a hands-on experience on its strengths and challenges. In part 1 we overview the modeling methodology and introduce Live Sequence Charts (LSCs) and a textual variant, the Scenario Modeling Language (SML). We also introduce ScenarioTools, which supports the modeling and analysis of SML specifications. In part 2, we interactively model parts of a car-to-x system. We reflect on the method and discuss research opportunities.",
							"organizers" : [
								{
									"name" : "Joel Greenyer"	
								},
								{
									"name" : "Daniel Gritzner"	
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T120000Z",
					"icalEnd" : "20161002T133000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Creating a Domain-Specific Graphical Modeling Workbench with Eclipse Technologies",
							"abstract" : "This tutorial will explain how to create a domain-specific graphical modeling workbench by using Eclipse Sirius. The tutorial will start with the definition of the metamodel by using Ecore Tools. Then, several diagrams and tabular representations with their tools (edition, navigation, complexity management, …) will be created with Sirius. Finally we will show how to combine this workbench with other Eclipse Modeling technologies such as Xtext to persist the models into a human-readable textual format and Acceleo to generate code.",
							"organizers" : [
								{
									"name" : "Frederic Madiot"	
								},
								{
									"name" : "Cedric Brun"	
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T120000Z",
					"icalEnd" : "20161002T133000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Technologies and Design Patterns for Model-based Development of Cyber-physical Systems",
							"abstract" : "Cyber-physical systems (CPS) are complex engineering systems that interact directly with the physical world. They generally combine different engineering technologies, (e.g., mechanical, electrical) with embedded software, which is primarily responsible for monitoring and control functions. Traditional design approaches for such systems were based on an early decomposition into technology-centric subsystems, which were developed separately and then integrated towards the end of the development cycle. In contrast, modern CPS design takes a more holistic approach, which allows for increased flexibility in allocating functional responsibilities to the most appropriate technologies. This is made possible through more extensive and more effective use of computer-based engineering models. A key engineering challenge is how to construct and analyze models of such complex systems. To that end, a new generation of computer-based modeling languages has emerged. In this tutorial, we consider two industry standard modeling languages from this category, SysML and MARTE. We explore the rationale behind them, the relationships between them, and how they can be combined for effective and agile CPS design. Practical examples are used throughout to illustrate the various language concepts and their usage.",
							"organizers" : [
								{
									"name" : "Bran Selic"	
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T120000Z",
					"icalEnd" : "20161002T133000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "ME",
							"abstract" : "Software artefacts constantly increase in complexity, variety and novelty. Environment and business constraints, user requirements and new insights put additional pressure on their adaptability, availability, reliability and quality: they continuously need to be up to date and up to level. However, evolution issues are critical, complex and costly to manage. They concern requirements, architecture, design, source code, documentation, integration as well as deployment. They also typically affect various kinds of models (data, behavioural, domain, source code or goal models). Addressing and managing these varieties of changes is essential. Models and meta-models, the cornerstone of complex software systems’ abstraction, represent a powerful mean for facing software evolution challenges by ensuring a more abstract and expressive modelling of software evolution. They can help and guide software evolution, and can enforce and reduce critical risks and important involved resources. The workshop puts the focus on Models and Evolution by considering two main sides:\n(1) Managing software evolution needs by relying on the high-level abstraction power of models and meta-models.\n(2) Managing models and metamodels evolution needs by putting attention to their increasing evolution issues as they become primary artefacts and to the need of co-evolution of all related software artefacts.",
							"url" : "http://www.models-and-evolution.com/",
							"organizers" : [
								{
									"name" : "Dalila Tamzalit",
									"email" : "Dalila.Tamzalit@univnantes.fr"
								},
								{
									"name" : "Alfonso Pierantonio",
									"email" : "alfonso.pierantonio@univaq.it"
								},
								{
									"name" : "Bernhard Schätz",
									"email" : "schaetz@fortiss.org"
								},
								{
									"name" : "Tanja Mayerhofer",
									"email" : "mayerhofer@big.tuwien.ac.at"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T120000Z",
					"icalEnd" : "20161002T133000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "OCL",
							"abstract" : "Limitations of graphical notations encourage the development of text-based modeling languages that either integrate with or replace graphical notations for modeling. Typical examples of such languages are OCL, textual MOF, Epsilon, and Alloy. The goal of this workshop is to create a forum where researchers and practitioners interested in building models using OCL or other kinds of textual languages can directly interact, report advances, share results, discuss appropriate standards and showcase tools on any aspect of textual modeling and analysis.",
							"url" : "http://oclworkshop.github.io/2016/",
							"organizers" : [
								{
									"name" : "Achim D. Brucker",
									"email" : "a.brucker@sheffield.ac.uk"
								},
								{
									"name" : "Jordi Cabot",
									"email" : "jordi.cabot@icrea.cat"
								},
								{
									"name" : "Adolfo Sanchez-Barbudo Herrera",
									"email" : "asbh500@cs.york.uk"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T120000Z",
					"icalEnd" : "20161002T133000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "FlexMDE",
							"abstract" : "Over the last years, numerous modeling platforms have been developed to simplify and automate many steps of Model Driven Engineering (MDE) processes. However, still several challenges have to be solved for enabling a wider adoption of MDE. One of the most important impediments in adopting MDE tools is related to the reduced flexibility of existing modeling platforms that do not permit to relax or enforce their rigidity depending on the stages of the applied development process. For instance, EMF does not permit to enter models which are not conforming to a metamodel. On one hand this allows only valid models to be defined, but on the other, it makes the corresponding pragmatics more difficult. Thus there is an increasing need for techniques supporting flexibility in a wide range of modeling activities, including metamodel, model, and model transformation development and reuse. The workshop aims at identifying the difficulties in the current practice of MDE related to the lack of flexibility, and soliciting contributions of ideas, concepts, and techniques also from other areas of software development which could be useful to revise certain MDE fundamental typing concepts, to facilitate flexible reuse of MDE artefacts, and to define agile model sketching techniques.",
							"url" : "http://www.di.univaq.it/flexmde/",
							"organizers" : [
								{
									"name" : "Davide Di Ruscio",
									"email" : "davide.diruscio@univaq.it"
								},
								{
									"name" : "Alfonso Pierantonio",
									"email" : "alfonso.pierantonio@univaq.it"
								},
								{
									"name" : "Juan De Lara",
									"email" : "Juan.deLara@uam.es"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T120000Z",
					"icalEnd" : "20161002T133000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "VOLT",
							"abstract" : "Model transformations are everywhere in software development, implicitly or explicitly. They have been described as “the heart and soul of Model-Driven Development (MDD)”. Several experts have identified the verification of model transformations as one of the grand challenges of MDD. Despite some recent activity in the field, the work on the verification of model transformations remains scattered and a clear perspective on the subject is still not in sight. Furthermore, current model transformation tools most often lack verification techniques to support such activities. The Fifth International Workshop on the Verification Of modeL Transformation is one of the most accurate venues to offer researchers a dedicated forum to classify, discuss, propose, and advance verification techniques dedicated to model transformations. VOLT promotes discussions between theoreticians and practitioners from academy and industry, given its ideal co-location with MODELS. VOLT’s interest spans both to academic and industrial practices. One of the goals of the forum is to collect enough industrial case studies so that those problems can be stated at a theoretical level.",
							"url" : "http://www-ens.iro.umontreal.ca/~syriani/volt2016/",
							"organizers" : [
								{
									"name" : "Moussa Amrani",
									"email" : "moussa.amrani@unamur.be"
								},
								{
									"name" : "Eugene Syriani",
									"email" : "syriani@iro.umontreal.ca"
								}
							]
						}
					]
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "15:30",
					"rowSpan" : 2
				},
				{
					"start" : "15:30",
					"end" : "16:00",
					"rowSpan" : 2,
					"icalStart" : "20161002T133000Z",
					"icalEnd" : "20161002T140000Z",
					"room" : "Rotonde Surcouf",
					"events" : [
						{
							"type" : "CoffeeBreak",
							"title" : "Coffee Break"
						}
					]
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				}
			],
			[],
			[
				{
					"start" : "16:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T140000Z",
					"icalEnd" : "20161002T153000Z",
					"room" : "Bouvet 1",
					"events" : [
						{
							"type" : "DoctoralSymposium",
							"title" : "Doctoral Symposium",
							"organizers" : [
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T140000Z",
					"icalEnd" : "20161002T153000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Modeling Reactive Systems with the Scenario Modeling Language and ScenarioTools",
							"abstract" : "Software-intensive systems in many domains consist of multiple cooperating reactive components. The distributed and concurrent nature of these systems makes the software development difficult. Key to avoiding the costly iterations is having a precise and consistent specification. In this tutorial, we present a powerful formal, scenario-based method for modeling reactive system specifications. Software engineers can specify the inter-component behavior by a set of scenarios. Each scenario describes what the system must or must not do in a certain situation and in reaction to certain events. This fits how engineers conceive and communicate the behavior during the early design. Specifications can be executed, which allows engineers to understand the interplay of the scenarios. Inconsistencies can be detected through formal synthesis algorithms. For curious beginners, but also for experienced reactive systems modelers, we introduce scenario-based modeling and give a hands-on experience on its strengths and challenges. In part 1 we overview the modeling methodology and introduce Live Sequence Charts (LSCs) and a textual variant, the Scenario Modeling Language (SML). We also introduce ScenarioTools, which supports the modeling and analysis of SML specifications. In part 2, we interactively model parts of a car-to-x system. We reflect on the method and discuss research opportunities.",
							"organizers" : [
								{
									"name" : "Joel Greenyer"	
								},
								{
									"name" : "Daniel Gritzner"	
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T140000Z",
					"icalEnd" : "20161002T153000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Creating a Domain-Specific Graphical Modeling Workbench with Eclipse Technologies",
							"abstract" : "This tutorial will explain how to create a domain-specific graphical modeling workbench by using Eclipse Sirius. The tutorial will start with the definition of the metamodel by using Ecore Tools. Then, several diagrams and tabular representations with their tools (edition, navigation, complexity management, …) will be created with Sirius. Finally we will show how to combine this workbench with other Eclipse Modeling technologies such as Xtext to persist the models into a human-readable textual format and Acceleo to generate code.",
							"organizers" : [
								{
									"name" : "Frederic Madiot"	
								},
								{
									"name" : "Cedric Brun"	
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T140000Z",
					"icalEnd" : "20161002T153000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Technologies and Design Patterns for Model-based Development of Cyber-physical Systems",
							"abstract" : "Cyber-physical systems (CPS) are complex engineering systems that interact directly with the physical world. They generally combine different engineering technologies, (e.g., mechanical, electrical) with embedded software, which is primarily responsible for monitoring and control functions. Traditional design approaches for such systems were based on an early decomposition into technology-centric subsystems, which were developed separately and then integrated towards the end of the development cycle. In contrast, modern CPS design takes a more holistic approach, which allows for increased flexibility in allocating functional responsibilities to the most appropriate technologies. This is made possible through more extensive and more effective use of computer-based engineering models. A key engineering challenge is how to construct and analyze models of such complex systems. To that end, a new generation of computer-based modeling languages has emerged. In this tutorial, we consider two industry standard modeling languages from this category, SysML and MARTE. We explore the rationale behind them, the relationships between them, and how they can be combined for effective and agile CPS design. Practical examples are used throughout to illustrate the various language concepts and their usage.",
							"organizers" : [
								{
									"name" : "Bran Selic"	
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T140000Z",
					"icalEnd" : "20161002T153000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "ME",
							"abstract" : "Software artefacts constantly increase in complexity, variety and novelty. Environment and business constraints, user requirements and new insights put additional pressure on their adaptability, availability, reliability and quality: they continuously need to be up to date and up to level. However, evolution issues are critical, complex and costly to manage. They concern requirements, architecture, design, source code, documentation, integration as well as deployment. They also typically affect various kinds of models (data, behavioural, domain, source code or goal models). Addressing and managing these varieties of changes is essential. Models and meta-models, the cornerstone of complex software systems’ abstraction, represent a powerful mean for facing software evolution challenges by ensuring a more abstract and expressive modelling of software evolution. They can help and guide software evolution, and can enforce and reduce critical risks and important involved resources. The workshop puts the focus on Models and Evolution by considering two main sides:\n(1) Managing software evolution needs by relying on the high-level abstraction power of models and meta-models.\n(2) Managing models and metamodels evolution needs by putting attention to their increasing evolution issues as they become primary artefacts and to the need of co-evolution of all related software artefacts.",
							"url" : "http://www.models-and-evolution.com/",
							"organizers" : [
								{
									"name" : "Dalila Tamzalit",
									"email" : "Dalila.Tamzalit@univnantes.fr"
								},
								{
									"name" : "Alfonso Pierantonio",
									"email" : "alfonso.pierantonio@univaq.it"
								},
								{
									"name" : "Bernhard Schätz",
									"email" : "schaetz@fortiss.org"
								},
								{
									"name" : "Tanja Mayerhofer",
									"email" : "mayerhofer@big.tuwien.ac.at"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T140000Z",
					"icalEnd" : "20161002T153000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "OCL",
							"abstract" : "Limitations of graphical notations encourage the development of text-based modeling languages that either integrate with or replace graphical notations for modeling. Typical examples of such languages are OCL, textual MOF, Epsilon, and Alloy. The goal of this workshop is to create a forum where researchers and practitioners interested in building models using OCL or other kinds of textual languages can directly interact, report advances, share results, discuss appropriate standards and showcase tools on any aspect of textual modeling and analysis.",
							"url" : "http://oclworkshop.github.io/2016/",
							"organizers" : [
								{
									"name" : "Achim D. Brucker",
									"email" : "a.brucker@sheffield.ac.uk"
								},
								{
									"name" : "Jordi Cabot",
									"email" : "jordi.cabot@icrea.cat"
								},
								{
									"name" : "Adolfo Sanchez-Barbudo Herrera",
									"email" : "asbh500@cs.york.uk"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T140000Z",
					"icalEnd" : "20161002T153000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "FlexMDE",
							"abstract" : "Over the last years, numerous modeling platforms have been developed to simplify and automate many steps of Model Driven Engineering (MDE) processes. However, still several challenges have to be solved for enabling a wider adoption of MDE. One of the most important impediments in adopting MDE tools is related to the reduced flexibility of existing modeling platforms that do not permit to relax or enforce their rigidity depending on the stages of the applied development process. For instance, EMF does not permit to enter models which are not conforming to a metamodel. On one hand this allows only valid models to be defined, but on the other, it makes the corresponding pragmatics more difficult. Thus there is an increasing need for techniques supporting flexibility in a wide range of modeling activities, including metamodel, model, and model transformation development and reuse. The workshop aims at identifying the difficulties in the current practice of MDE related to the lack of flexibility, and soliciting contributions of ideas, concepts, and techniques also from other areas of software development which could be useful to revise certain MDE fundamental typing concepts, to facilitate flexible reuse of MDE artefacts, and to define agile model sketching techniques.",
							"url" : "http://www.di.univaq.it/flexmde/",
							"organizers" : [
								{
									"name" : "Davide Di Ruscio",
									"email" : "davide.diruscio@univaq.it"
								},
								{
									"name" : "Alfonso Pierantonio",
									"email" : "alfonso.pierantonio@univaq.it"
								},
								{
									"name" : "Juan De Lara",
									"email" : "Juan.deLara@uam.es"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161002T140000Z",
					"icalEnd" : "20161002T153000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "VOLT",
							"abstract" : "Model transformations are everywhere in software development, implicitly or explicitly. They have been described as “the heart and soul of Model-Driven Development (MDD)”. Several experts have identified the verification of model transformations as one of the grand challenges of MDD. Despite some recent activity in the field, the work on the verification of model transformations remains scattered and a clear perspective on the subject is still not in sight. Furthermore, current model transformation tools most often lack verification techniques to support such activities. The Fifth International Workshop on the Verification Of modeL Transformation is one of the most accurate venues to offer researchers a dedicated forum to classify, discuss, propose, and advance verification techniques dedicated to model transformations. VOLT promotes discussions between theoreticians and practitioners from academy and industry, given its ideal co-location with MODELS. VOLT’s interest spans both to academic and industrial practices. One of the goals of the forum is to collect enough industrial case studies so that those problems can be stated at a theoretical level.",
							"url" : "http://www-ens.iro.umontreal.ca/~syriani/volt2016/",
							"organizers" : [
								{
									"name" : "Moussa Amrani",
									"email" : "moussa.amrani@unamur.be"
								},
								{
									"name" : "Eugene Syriani",
									"email" : "syriani@iro.umontreal.ca"
								}
							]
						}
					]
				}
			],
			[],
			[],
			[],
			[],
			[]
		]
	},
	{
		"name" : "Monday, Oct 3, 2016",
		"rooms" : [
			{
				"name" : "Rotonde Surcouf"
			},
			{
				"name" : "Rotonde J. Cartier"
			},
			{
				"name" : "Bouvet 1",
				"capacity" : 45
			},
			{
				"name" : "Bouvet 2",
				"capacity" : 45
			},
			{
				"name" : "Charcot",
				"capacity" : 54
			},
			{
				"name" : "Vauban 1",
				"capacity" : 50
			},
			{
				"name" : "Vauban 2",
				"capacity" : 60
			},
			{
				"name" : "Lamennais 1",
				"capacity" : 80
			},
			{
				"name" : "Lamennais 2",
				"capacity" : 80
			},
			{
				"name" : "Lamennais 3",
				"capacity" : 80
			},
			{
				"name" : "Grand Large"
			}
		],
		"sessionGroups" : [
			[
				{
					"start" : "09:00",
					"rowSpan" : 6
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T070000Z",
					"icalEnd" : "20161003T083000Z",
					"room" : "Rotonde Surcouf",
					"events" : [
						{
							"type" : "Clinic",
							"title" : "Clinic"
						}
					]
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T070000Z",
					"icalEnd" : "20161003T083000Z",
					"room" : "Bouvet 1",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Empirical Research in Model Based Software Engineering",
							"abstract" : "Modelling is applied in many different ways in software engineering: for facilitating communication, for analyzing systems, for generating code and tests. Thus, the evaluation of modelling techniques, languages and tools is needed in order to assess their advantages and disadvantages, to ensure their applicability to different contexts, their ease of use, and other issues such as skills and costs. However, many papers submitted to the MODELS conference lack empirical validations of their proposed methods/techniques. This tutorial offers an introduction to empirical methods in software engineering and thereby aims to equip researchers in the MODELS community with knowledge required to perform evaluations. This tutorial is offered by a group of people with broad experience in several types of empirical studies (including experiments, surveys, case studies, action research).",
							"organizers" : [
								{
									"name" : "Michel Chaudron"	
								},
								{
									"name" : "Regina Hebig"	
								},
								{
									"name" : "Maria Teresa Baldassarre"	
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T070000Z",
					"icalEnd" : "20161003T083000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Applying Model Driven Engineering Technologies in the Creation of Domain Specific Modeling Languages",
							"abstract" : "Model Driven Engineering (MDE) brings together multiple technologies and critical innovations and formalizes them into the next wave of software development methods. This tutorial will cover the basic patterns, principles and practices of MDE. The three main MDE categories include the development of Domain Specific Languages (DSL), Domain Specific Editors (and Views), and Domain Specific Transformation Engines or Generators. Expressed in terms of language development technology, these mirror the development of the Abstract Syntax, Concrete Syntax and Semantics of a new Domain Specific Language. This tutorial will cover the basic effective patterns, principles and practices for developing these MDE software artifacts. The tutorial will show how to apply these concepts as effective means with which to both raise levels of abstraction and domain specificity and thus increase power and value of tools and languages that allow developers to tackle the complexities of today’s software systems. It will also show how to effectively leverage abstraction without sacrificing the ability to robustly and precisely refine these abstractions to solve complex real world problems. To show these patterns and principles in action, this tutorial will cover the details of how to leverage MDE Language Workbenches and frameworks in support of robust software development.",
							"organizers" : [
								{
									"name" : "Bruce Trask"	
								},
								{
									"name" : "Angel Roman"	
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T070000Z",
					"icalEnd" : "20161003T083000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "PAME",
							"abstract" : "PAME is intended to be the first forum for practitioners in MDE to discuss patterns that occur often during the different modeling activities. The aim of this workshop is to provide an arena for proposing and discussing good practices, patterns, pattern-based modeling, as well as start the initiative of developing a “language” for discussing and describing relevant problems and their solutions in the form of patterns.",
							"url" : "http://www-ens.iro.umontreal.ca/~syriani/pame2016",
							"organizers" : [
								{
									"name" : "Eugene Syriani",
									"email" : "syriani@iro.umontreal.ca"
								},
								{
									"name" : "Richard Paige",
									"email" : "richard.paige@york.ac.uk"
								},
								{
									"name" : "Steffen Zschaler",
									"email" : "steffen.zschaler@kcl.ac.uk"
								},
								{
									"name" : "Huseyin Ergin",
									"email" : "hergin@crimson.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T070000Z",
					"icalEnd" : "20161003T083000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "EducatorSymposium",
							"title" : "Educator Symposium",
							"organizers" : [
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T070000Z",
					"icalEnd" : "20161003T083000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "OSS4MDE",
							"abstract" : "Just like the previous versions of the workshop, OSS4MDE’16 workshop will bring together researchers, educators and industry representatives interested in modeling and MDE with open source tools. However, compared to previous incarnations, OSS4MDE’16 will be less formal and more interactive, and place more emphasis on promoting open source by inspiring and encouraging potential users and contributors, and supporting existing users and contributors.",
							"url" : "http://mase.cs.queensu.ca/oss4mde",
							"organizers" : [
								{
									"name" : "Juergen Dingel",
									"email" : "dingel@cs.queensu.ca"
								},
								{
									"name" : "Francis Bordeleau",
									"email" : "francis.bordeleau@ericsson.com"
								},
								{
									"name" : "Jean-Michel Bruel",
									"email" : "bruel@irit.fr"
								},
								{
									"name" : "Sebastien Gerard",
									"email" : "sebastien.gerard@cea.fr"
								},
								{
									"name" : "Sebastian Voss",
									"email" : "voss@fortiss.org"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T070000Z",
					"icalEnd" : "20161003T083000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "EXE",
							"abstract" : "Executable models have the potential of bringing major benefits to the development of complex systems, as they provide abstractions of complex system behaviors and allow for the performance of early analyses of that behavior. Despite the potential benefits of executable models, there are still many challenges to solve, such as the lack of maturity in the definition of and tooling for executable modeling languages, and the limited experience with executable modeling in much of the software development industry. The objective of this workshop is to draw attention to the potentials and challenges of executable modeling and advance the state-of-the-art in executable modeling. We aim at bringing together researchers working towards overcoming challenges in executable modeling, as well as practitioners from different application domains and application contexts of executable modeling. The workshop intends to provide a forum for exchanging recent results, ideas, opinions, requirements, and experiences in executable modeling.",
							"url" : "http://www.modelexecution.org/",
							"organizers" : [
								{
									"name" : "Tanja Mayerhofer",
									"email" : "mayerhofer@big.tuwien.ac.at"
								},
								{
									"name" : "Philip Langer",
									"email" : "planger@eclipsesource.com"
								},
								{
									"name" : "Ed Seidewitz",
									"email" : "ed-s@modeldriven.com"
								},
								{
									"name" : "Jeff Gray",
									"email" : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T070000Z",
					"icalEnd" : "20161003T083000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MoDeVVa",
							"abstract" : "MoDeVVa offers a forum for researchers and practitioners who are working on Verification & Validation and Models-driven Engineering. The major questions of interest in MoDeVVa concern the mutual benefits of MDE and V&V: How can models-driven engineering improve V&V?, and How can V&V leverage the techniques around models-driven engineering? In 2016 we put an emphasis on making the V&V activities of MDE artefacts a systematic process. This includes modeling the V&V activities, investigating the synergies between them or composing different V&V activities to increase the confidence in the verification results.",
							"url" : "https://sites.google.com/site/modevva/",
							"organizers" : [
								{
									"name" : "Michalis Famelis",
									"email" : "famelis@cs.ubc.ca"
								},
								{
									"name" : "Daniel Ratiu",
									"email" : "daniel.ratiu@siemens.com"
								},
								{
									"name" : "Gehan M. K. Selim",
									"email" : "gehan@cs.queensu.ca"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T070000Z",
					"icalEnd" : "20161003T083000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "SAM",
							"organizers" : [
							]
						}
					]
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "10:30",
					"rowSpan" : 2
				},
				{
					"start" : "10:30",
					"end" : "11:00",
					"rowSpan" : 2,
					"icalStart" : "20161003T083000Z",
					"icalEnd" : "20161003T090000Z",
					"room" : "Rotonde Surcouf",
					"events" : [
						{
							"type" : "SRC",
							"title" : "SRC Poster"
						},
						{
							"type" : "Clinic",
							"title" : "Clinic"
						},
						{
							"type" : "CoffeeBreak",
							"title" : "Coffee Break"
						}
					]
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				}
			],
			[],
			[
				{
					"start" : "11:00",
					"rowSpan" : 6
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T090000Z",
					"icalEnd" : "20161003T103000Z",
					"room" : "Rotonde Surcouf",
					"events" : [
						{
							"type" : "Clinic",
							"title" : "Clinic"
						}
					]
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T090000Z",
					"icalEnd" : "20161003T103000Z",
					"room" : "Bouvet 1",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Empirical Research in Model Based Software Engineering",
							"abstract" : "Modelling is applied in many different ways in software engineering: for facilitating communication, for analyzing systems, for generating code and tests. Thus, the evaluation of modelling techniques, languages and tools is needed in order to assess their advantages and disadvantages, to ensure their applicability to different contexts, their ease of use, and other issues such as skills and costs. However, many papers submitted to the MODELS conference lack empirical validations of their proposed methods/techniques. This tutorial offers an introduction to empirical methods in software engineering and thereby aims to equip researchers in the MODELS community with knowledge required to perform evaluations. This tutorial is offered by a group of people with broad experience in several types of empirical studies (including experiments, surveys, case studies, action research).",
							"organizers" : [
								{
									"name" : "Michel Chaudron"	
								},
								{
									"name" : "Regina Hebig"	
								},
								{
									"name" : "Maria Teresa Baldassarre"	
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T090000Z",
					"icalEnd" : "20161003T103000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Applying Model Driven Engineering Technologies in the Creation of Domain Specific Modeling Languages",
							"abstract" : "Model Driven Engineering (MDE) brings together multiple technologies and critical innovations and formalizes them into the next wave of software development methods. This tutorial will cover the basic patterns, principles and practices of MDE. The three main MDE categories include the development of Domain Specific Languages (DSL), Domain Specific Editors (and Views), and Domain Specific Transformation Engines or Generators. Expressed in terms of language development technology, these mirror the development of the Abstract Syntax, Concrete Syntax and Semantics of a new Domain Specific Language. This tutorial will cover the basic effective patterns, principles and practices for developing these MDE software artifacts. The tutorial will show how to apply these concepts as effective means with which to both raise levels of abstraction and domain specificity and thus increase power and value of tools and languages that allow developers to tackle the complexities of today’s software systems. It will also show how to effectively leverage abstraction without sacrificing the ability to robustly and precisely refine these abstractions to solve complex real world problems. To show these patterns and principles in action, this tutorial will cover the details of how to leverage MDE Language Workbenches and frameworks in support of robust software development.",
							"organizers" : [
								{
									"name" : "Bruce Trask"	
								},
								{
									"name" : "Angel Roman"	
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T090000Z",
					"icalEnd" : "20161003T103000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "PAME",
							"abstract" : "PAME is intended to be the first forum for practitioners in MDE to discuss patterns that occur often during the different modeling activities. The aim of this workshop is to provide an arena for proposing and discussing good practices, patterns, pattern-based modeling, as well as start the initiative of developing a “language” for discussing and describing relevant problems and their solutions in the form of patterns.",
							"url" : "http://www-ens.iro.umontreal.ca/~syriani/pame2016",
							"organizers" : [
								{
									"name" : "Eugene Syriani",
									"email" : "syriani@iro.umontreal.ca"
								},
								{
									"name" : "Richard Paige",
									"email" : "richard.paige@york.ac.uk"
								},
								{
									"name" : "Steffen Zschaler",
									"email" : "steffen.zschaler@kcl.ac.uk"
								},
								{
									"name" : "Huseyin Ergin",
									"email" : "hergin@crimson.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T090000Z",
					"icalEnd" : "20161003T103000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "EducatorSymposium",
							"title" : "Educator Symposium",
							"organizers" : [
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T090000Z",
					"icalEnd" : "20161003T103000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "OSS4MDE",
							"abstract" : "Just like the previous versions of the workshop, OSS4MDE’16 workshop will bring together researchers, educators and industry representatives interested in modeling and MDE with open source tools. However, compared to previous incarnations, OSS4MDE’16 will be less formal and more interactive, and place more emphasis on promoting open source by inspiring and encouraging potential users and contributors, and supporting existing users and contributors.",
							"url" : "http://mase.cs.queensu.ca/oss4mde",
							"organizers" : [
								{
									"name" : "Juergen Dingel",
									"email" : "dingel@cs.queensu.ca"
								},
								{
									"name" : "Francis Bordeleau",
									"email" : "francis.bordeleau@ericsson.com"
								},
								{
									"name" : "Jean-Michel Bruel",
									"email" : "bruel@irit.fr"
								},
								{
									"name" : "Sebastien Gerard",
									"email" : "sebastien.gerard@cea.fr"
								},
								{
									"name" : "Sebastian Voss",
									"email" : "voss@fortiss.org"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T090000Z",
					"icalEnd" : "20161003T103000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "EXE",
							"abstract" : "Executable models have the potential of bringing major benefits to the development of complex systems, as they provide abstractions of complex system behaviors and allow for the performance of early analyses of that behavior. Despite the potential benefits of executable models, there are still many challenges to solve, such as the lack of maturity in the definition of and tooling for executable modeling languages, and the limited experience with executable modeling in much of the software development industry. The objective of this workshop is to draw attention to the potentials and challenges of executable modeling and advance the state-of-the-art in executable modeling. We aim at bringing together researchers working towards overcoming challenges in executable modeling, as well as practitioners from different application domains and application contexts of executable modeling. The workshop intends to provide a forum for exchanging recent results, ideas, opinions, requirements, and experiences in executable modeling.",
							"url" : "http://www.modelexecution.org/",
							"organizers" : [
								{
									"name" : "Tanja Mayerhofer",
									"email" : "mayerhofer@big.tuwien.ac.at"
								},
								{
									"name" : "Philip Langer",
									"email" : "planger@eclipsesource.com"
								},
								{
									"name" : "Ed Seidewitz",
									"email" : "ed-s@modeldriven.com"
								},
								{
									"name" : "Jeff Gray",
									"email" : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T090000Z",
					"icalEnd" : "20161003T103000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MoDeVVa",
							"abstract" : "MoDeVVa offers a forum for researchers and practitioners who are working on Verification & Validation and Models-driven Engineering. The major questions of interest in MoDeVVa concern the mutual benefits of MDE and V&V: How can models-driven engineering improve V&V?, and How can V&V leverage the techniques around models-driven engineering? In 2016 we put an emphasis on making the V&V activities of MDE artefacts a systematic process. This includes modeling the V&V activities, investigating the synergies between them or composing different V&V activities to increase the confidence in the verification results.",
							"url" : "https://sites.google.com/site/modevva/",
							"organizers" : [
								{
									"name" : "Michalis Famelis",
									"email" : "famelis@cs.ubc.ca"
								},
								{
									"name" : "Daniel Ratiu",
									"email" : "daniel.ratiu@siemens.com"
								},
								{
									"name" : "Gehan M. K. Selim",
									"email" : "gehan@cs.queensu.ca"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T090000Z",
					"icalEnd" : "20161003T103000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "SAM",
							"organizers" : [
							]
						}
					]
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "12:30",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "12:30",
					"end" : "14:00",
					"rowSpan" : 6,
					"icalStart" : "20161003T103000Z",
					"icalEnd" : "20161003T120000Z",
					"room" : "Rotonde J. Cartier",
					"events" : [
						{
							"type" : "Lunch",
							"title" : "Lunch"
						}
					]
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "14:00",
					"rowSpan" : 6
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T120000Z",
					"icalEnd" : "20161003T133000Z",
					"room" : "Rotonde Surcouf",
					"events" : [
						{
							"type" : "Clinic",
							"title" : "Clinic"
						}
					]
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T120000Z",
					"icalEnd" : "20161003T133000Z",
					"room" : "Bouvet 1",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Empirical Research in Model Based Software Engineering",
							"abstract" : "Modelling is applied in many different ways in software engineering: for facilitating communication, for analyzing systems, for generating code and tests. Thus, the evaluation of modelling techniques, languages and tools is needed in order to assess their advantages and disadvantages, to ensure their applicability to different contexts, their ease of use, and other issues such as skills and costs. However, many papers submitted to the MODELS conference lack empirical validations of their proposed methods/techniques. This tutorial offers an introduction to empirical methods in software engineering and thereby aims to equip researchers in the MODELS community with knowledge required to perform evaluations. This tutorial is offered by a group of people with broad experience in several types of empirical studies (including experiments, surveys, case studies, action research).",
							"organizers" : [
								{
									"name" : "Michel Chaudron"	
								},
								{
									"name" : "Regina Hebig"	
								},
								{
									"name" : "Maria Teresa Baldassarre"	
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T120000Z",
					"icalEnd" : "20161003T133000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Multi-level Modelling with MetaDepth",
							"abstract" : "Model-Driven Engineering (MDE) promotes models as the primary artefacts in the software development process, from which code for the final application is derived. Standard approaches to MDE (like those based on MOF or EMF) advocate a two-level meta-modelling setting where domain-specific modelling languages are defined through a meta-model, which is instantiated to build models at the meta-level below. Multi-level modelling — also called deep meta-modelling — extends the standard approach to meta-modelling by enabling modelling at an arbitrary number of meta-levels, not necessarily two. This approach leads to simpler models in situations where the type-object pattern or some of its variants arises. In this tutorial, we will discuss the motivation for multi-level modelling and explain its basic concepts. These will be illustrated in practice with the MetaDepth tool, developed by the lecturers. The tutorial will also cover the use of constraint and model management languages (e.g., for code generation or model-to-model transformation) in a multi-level setting, and will finish by introducing more advanced multi-level concepts.",
							"organizers" : [
								{
									"name" : "Juan De Lara"	
								},
								{
									"name" : "Esther Guerra"	
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T120000Z",
					"icalEnd" : "20161003T133000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "PAME",
							"abstract" : "PAME is intended to be the first forum for practitioners in MDE to discuss patterns that occur often during the different modeling activities. The aim of this workshop is to provide an arena for proposing and discussing good practices, patterns, pattern-based modeling, as well as start the initiative of developing a “language” for discussing and describing relevant problems and their solutions in the form of patterns.",
							"url" : "http://www-ens.iro.umontreal.ca/~syriani/pame2016",
							"organizers" : [
								{
									"name" : "Eugene Syriani",
									"email" : "syriani@iro.umontreal.ca"
								},
								{
									"name" : "Richard Paige",
									"email" : "richard.paige@york.ac.uk"
								},
								{
									"name" : "Steffen Zschaler",
									"email" : "steffen.zschaler@kcl.ac.uk"
								},
								{
									"name" : "Huseyin Ergin",
									"email" : "hergin@crimson.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T120000Z",
					"icalEnd" : "20161003T133000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "EducatorSymposium",
							"title" : "Educator Symposium",
							"organizers" : [
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T120000Z",
					"icalEnd" : "20161003T133000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "OSS4MDE",
							"abstract" : "Just like the previous versions of the workshop, OSS4MDE’16 workshop will bring together researchers, educators and industry representatives interested in modeling and MDE with open source tools. However, compared to previous incarnations, OSS4MDE’16 will be less formal and more interactive, and place more emphasis on promoting open source by inspiring and encouraging potential users and contributors, and supporting existing users and contributors.",
							"url" : "http://mase.cs.queensu.ca/oss4mde",
							"organizers" : [
								{
									"name" : "Juergen Dingel",
									"email" : "dingel@cs.queensu.ca"
								},
								{
									"name" : "Francis Bordeleau",
									"email" : "francis.bordeleau@ericsson.com"
								},
								{
									"name" : "Jean-Michel Bruel",
									"email" : "bruel@irit.fr"
								},
								{
									"name" : "Sebastien Gerard",
									"email" : "sebastien.gerard@cea.fr"
								},
								{
									"name" : "Sebastian Voss",
									"email" : "voss@fortiss.org"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T120000Z",
					"icalEnd" : "20161003T133000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "EXE",
							"abstract" : "Executable models have the potential of bringing major benefits to the development of complex systems, as they provide abstractions of complex system behaviors and allow for the performance of early analyses of that behavior. Despite the potential benefits of executable models, there are still many challenges to solve, such as the lack of maturity in the definition of and tooling for executable modeling languages, and the limited experience with executable modeling in much of the software development industry. The objective of this workshop is to draw attention to the potentials and challenges of executable modeling and advance the state-of-the-art in executable modeling. We aim at bringing together researchers working towards overcoming challenges in executable modeling, as well as practitioners from different application domains and application contexts of executable modeling. The workshop intends to provide a forum for exchanging recent results, ideas, opinions, requirements, and experiences in executable modeling.",
							"url" : "http://www.modelexecution.org/",
							"organizers" : [
								{
									"name" : "Tanja Mayerhofer",
									"email" : "mayerhofer@big.tuwien.ac.at"
								},
								{
									"name" : "Philip Langer",
									"email" : "planger@eclipsesource.com"
								},
								{
									"name" : "Ed Seidewitz",
									"email" : "ed-s@modeldriven.com"
								},
								{
									"name" : "Jeff Gray",
									"email" : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T120000Z",
					"icalEnd" : "20161003T133000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MoDeVVa",
							"abstract" : "MoDeVVa offers a forum for researchers and practitioners who are working on Verification & Validation and Models-driven Engineering. The major questions of interest in MoDeVVa concern the mutual benefits of MDE and V&V: How can models-driven engineering improve V&V?, and How can V&V leverage the techniques around models-driven engineering? In 2016 we put an emphasis on making the V&V activities of MDE artefacts a systematic process. This includes modeling the V&V activities, investigating the synergies between them or composing different V&V activities to increase the confidence in the verification results.",
							"url" : "https://sites.google.com/site/modevva/",
							"organizers" : [
								{
									"name" : "Michalis Famelis",
									"email" : "famelis@cs.ubc.ca"
								},
								{
									"name" : "Daniel Ratiu",
									"email" : "daniel.ratiu@siemens.com"
								},
								{
									"name" : "Gehan M. K. Selim",
									"email" : "gehan@cs.queensu.ca"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T120000Z",
					"icalEnd" : "20161003T133000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "SAM",
							"organizers" : [
							]
						}
					]
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "15:30",
					"rowSpan" : 2
				},
				{
					"start" : "15:30",
					"end" : "16:00",
					"rowSpan" : 2,
					"icalStart" : "20161003T133000Z",
					"icalEnd" : "20161003T140000Z",
					"room" : "Rotonde Surcouf",
					"events" : [
						{
							"type" : "SRC",
							"title" : "SRC Poster"
						},
						{
							"type" : "Clinic",
							"title" : "Clinic"
						},
						{
							"type" : "CoffeeBreak",
							"title" : "Coffee Break"
						}
					]
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				}
			],
			[],
			[
				{
					"start" : "16:00",
					"rowSpan" : 6
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T140000Z",
					"icalEnd" : "20161003T153000Z",
					"room" : "Rotonde Surcouf",
					"events" : [
						{
							"type" : "Clinic",
							"title" : "Clinic"
						}
					]
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T140000Z",
					"icalEnd" : "20161003T153000Z",
					"room" : "Bouvet 1",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Empirical Research in Model Based Software Engineering",
							"abstract" : "Modelling is applied in many different ways in software engineering: for facilitating communication, for analyzing systems, for generating code and tests. Thus, the evaluation of modelling techniques, languages and tools is needed in order to assess their advantages and disadvantages, to ensure their applicability to different contexts, their ease of use, and other issues such as skills and costs. However, many papers submitted to the MODELS conference lack empirical validations of their proposed methods/techniques. This tutorial offers an introduction to empirical methods in software engineering and thereby aims to equip researchers in the MODELS community with knowledge required to perform evaluations. This tutorial is offered by a group of people with broad experience in several types of empirical studies (including experiments, surveys, case studies, action research).",
							"organizers" : [
								{
									"name" : "Michel Chaudron"	
								},
								{
									"name" : "Regina Hebig"	
								},
								{
									"name" : "Maria Teresa Baldassarre"	
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T140000Z",
					"icalEnd" : "20161003T153000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Tutorial",
							"title" : "Multi-level Modelling with MetaDepth",
							"abstract" : "Model-Driven Engineering (MDE) promotes models as the primary artefacts in the software development process, from which code for the final application is derived. Standard approaches to MDE (like those based on MOF or EMF) advocate a two-level meta-modelling setting where domain-specific modelling languages are defined through a meta-model, which is instantiated to build models at the meta-level below. Multi-level modelling — also called deep meta-modelling — extends the standard approach to meta-modelling by enabling modelling at an arbitrary number of meta-levels, not necessarily two. This approach leads to simpler models in situations where the type-object pattern or some of its variants arises. In this tutorial, we will discuss the motivation for multi-level modelling and explain its basic concepts. These will be illustrated in practice with the MetaDepth tool, developed by the lecturers. The tutorial will also cover the use of constraint and model management languages (e.g., for code generation or model-to-model transformation) in a multi-level setting, and will finish by introducing more advanced multi-level concepts.",
							"organizers" : [
								{
									"name" : "Juan De Lara"	
								},
								{
									"name" : "Esther Guerra"	
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T140000Z",
					"icalEnd" : "20161003T153000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "PAME",
							"abstract" : "PAME is intended to be the first forum for practitioners in MDE to discuss patterns that occur often during the different modeling activities. The aim of this workshop is to provide an arena for proposing and discussing good practices, patterns, pattern-based modeling, as well as start the initiative of developing a “language” for discussing and describing relevant problems and their solutions in the form of patterns.",
							"url" : "http://www-ens.iro.umontreal.ca/~syriani/pame2016",
							"organizers" : [
								{
									"name" : "Eugene Syriani",
									"email" : "syriani@iro.umontreal.ca"
								},
								{
									"name" : "Richard Paige",
									"email" : "richard.paige@york.ac.uk"
								},
								{
									"name" : "Steffen Zschaler",
									"email" : "steffen.zschaler@kcl.ac.uk"
								},
								{
									"name" : "Huseyin Ergin",
									"email" : "hergin@crimson.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T140000Z",
					"icalEnd" : "20161003T153000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "EducatorSymposium",
							"title" : "Educator Symposium",
							"organizers" : [
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T140000Z",
					"icalEnd" : "20161003T153000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "OSS4MDE",
							"abstract" : "Just like the previous versions of the workshop, OSS4MDE’16 workshop will bring together researchers, educators and industry representatives interested in modeling and MDE with open source tools. However, compared to previous incarnations, OSS4MDE’16 will be less formal and more interactive, and place more emphasis on promoting open source by inspiring and encouraging potential users and contributors, and supporting existing users and contributors.",
							"url" : "http://mase.cs.queensu.ca/oss4mde",
							"organizers" : [
								{
									"name" : "Juergen Dingel",
									"email" : "dingel@cs.queensu.ca"
								},
								{
									"name" : "Francis Bordeleau",
									"email" : "francis.bordeleau@ericsson.com"
								},
								{
									"name" : "Jean-Michel Bruel",
									"email" : "bruel@irit.fr"
								},
								{
									"name" : "Sebastien Gerard",
									"email" : "sebastien.gerard@cea.fr"
								},
								{
									"name" : "Sebastian Voss",
									"email" : "voss@fortiss.org"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T140000Z",
					"icalEnd" : "20161003T153000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "EXE",
							"abstract" : "Executable models have the potential of bringing major benefits to the development of complex systems, as they provide abstractions of complex system behaviors and allow for the performance of early analyses of that behavior. Despite the potential benefits of executable models, there are still many challenges to solve, such as the lack of maturity in the definition of and tooling for executable modeling languages, and the limited experience with executable modeling in much of the software development industry. The objective of this workshop is to draw attention to the potentials and challenges of executable modeling and advance the state-of-the-art in executable modeling. We aim at bringing together researchers working towards overcoming challenges in executable modeling, as well as practitioners from different application domains and application contexts of executable modeling. The workshop intends to provide a forum for exchanging recent results, ideas, opinions, requirements, and experiences in executable modeling.",
							"url" : "http://www.modelexecution.org/",
							"organizers" : [
								{
									"name" : "Tanja Mayerhofer",
									"email" : "mayerhofer@big.tuwien.ac.at"
								},
								{
									"name" : "Philip Langer",
									"email" : "planger@eclipsesource.com"
								},
								{
									"name" : "Ed Seidewitz",
									"email" : "ed-s@modeldriven.com"
								},
								{
									"name" : "Jeff Gray",
									"email" : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T140000Z",
					"icalEnd" : "20161003T153000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MoDeVVa",
							"abstract" : "MoDeVVa offers a forum for researchers and practitioners who are working on Verification & Validation and Models-driven Engineering. The major questions of interest in MoDeVVa concern the mutual benefits of MDE and V&V: How can models-driven engineering improve V&V?, and How can V&V leverage the techniques around models-driven engineering? In 2016 we put an emphasis on making the V&V activities of MDE artefacts a systematic process. This includes modeling the V&V activities, investigating the synergies between them or composing different V&V activities to increase the confidence in the verification results.",
							"url" : "https://sites.google.com/site/modevva/",
							"organizers" : [
								{
									"name" : "Michalis Famelis",
									"email" : "famelis@cs.ubc.ca"
								},
								{
									"name" : "Daniel Ratiu",
									"email" : "daniel.ratiu@siemens.com"
								},
								{
									"name" : "Gehan M. K. Selim",
									"email" : "gehan@cs.queensu.ca"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161003T140000Z",
					"icalEnd" : "20161003T153000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "SAM",
							"organizers" : [
							]
						}
					]
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "17:30",
					"rowSpan" : 2
				},
				{
					"start" : "17:30",
					"end" : "19:00",
					"rowSpan" : 6,
					"icalStart" : "20161003T153000Z",
					"icalEnd" : "20161003T170000Z",
					"room" : "Rotonde Surcouf",
					"events" : [
						{
							"type" : "SRC",
							"title" : "SRC Poster"
						}
					]
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				}
			],
			[],
			[
				{
					"start" : "18:00",
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"start" : "18:00",
					"end" : "20:00",
					"rowSpan" : 8,
					"icalStart" : "20161003T160000Z",
					"icalEnd" : "20161003T180000Z",
					"room" : "Grand Large",
					"events" : [
						{
							"type" : "Reception",
							"title" : "Workshop Welcome Reception"
						}
					]
				}
			],
			[],
			[],
			[],
			[
				{
					"start" : "19:00",
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				},
				{
					"rowSpan" : 4
				}
			],
			[],
			[],
			[]
		]
	},
	{
		"name" : "Tuesday, Oct 4, 2016",
		"rooms" : [
			{
				"name" : "Rotonde Surcouf"
			},
			{
				"name" : "Rotonde J. Cartier"
			},
			{
				"name" : "Bouvet 1",
				"capacity" : 45
			},
			{
				"name" : "Bouvet 2",
				"capacity" : 45
			},
			{
				"name" : "Charcot",
				"capacity" : 54
			},
			{
				"name" : "Vauban 1",
				"capacity" : 50
			},
			{
				"name" : "Vauban 2",
				"capacity" : 60
			},
			{
				"name" : "Lamennais 1",
				"capacity" : 80
			},
			{
				"name" : "Lamennais 2",
				"capacity" : 80
			},
			{
				"name" : "Lamennais 3",
				"capacity" : 80
			}
		],
		"sessionGroups" : [
			[
				{
					"start" : "09:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T070000Z",
					"icalEnd" : "20161004T083000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "ModComp",
							"abstract" : "Model-Driven Engineering (MDE) and Component-Based Software Engineering (CBSE) have been proven to effectively reduce software development complexity by (i) shifting the focus from source code to models and (ii) breaking down the set of desired features and their intricacy into smaller sub-modules, respectively. Moreover, the interplay of MDE and CBSE approaches is gaining recognition as a very promising means to boost the development of software systems by reducing costs and risks and shorten time-to-market. While several attempts to effectively combine MDE and CBSE have been documented, there are still unsolved clashes raising when exploiting interplay of MDE and CBSE, mostly due to mismatches in the related terminology as well as to differences in their basic essence.\nAs satellite event of MoDELS, the goal of ModComp’16 is to gather researchers and practitioners to share opinions, propose solutions to open challenges and generally explore the frontiers of interweaving between MDE and CBSE.",
							"url" : "http://www.mrtc.mdh.se/ModComp16/",
							"organizers" : [
								{
									"name" : "Federico Ciccozzi",
									"email" : "federico.ciccozzi@mdh.se"
								},
								{
									"name" : "Ivano Malavolta",
									"email" : "ivano.malavolta@gssi.infn.it"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T070000Z",
					"icalEnd" : "20161004T083000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "COMMitMDE",
							"abstract" : "Nowadays, collaborative model-driven software engineering (MDSE) is gaining a growing interest in both academia and practice. Goal of COMMitMDE 2016 is to bring together researchers and practitioners in order to investigate together (i) the potential impact of collaborative software engineering methods and principles into MDE practices and (ii) how MDE methods and techniques can support collaborative software engineering activities. Also, COMMitMDE aims at assessing the state of the research and practice on collaborative MDE, creating new synergies between tool vendors, researchers, and practitioners.",
							"url" : "http://cs.gssi.infn.it/commitmde2016",
							"organizers" : [
								{
									"name" : "Henry Muccini",
									"email" : "henry.muccini@univaq.it"
								},
								{
									"name" : "Ivano Malavolta",
									"email" : "ivano.malavolta@gssi.infn.it"
								},
								{
									"name" : "Sébastien Gérard",
									"email" : "sebastien.gerard@cea.fr"
								},
								{
									"name" : "Dimitrios S. Kolovos",
									"email" : "dimitris.kolovos@york.ac.uk"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T070000Z",
					"icalEnd" : "20161004T083000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "HuFaMo",
							"abstract" : "Modeling is a genuinely human enterprise, so many of the questions related to modeling can only be answered by empirical studies of human factors. The HuFaMo workshop series is the premier venue for early stage empirical research involving human factors in modeling. Our goal is to improve the state of the science and professionalism in empirical research in the Model Based Engineering community. Typical examples of such questions might consider the usability of a certain approach such as a method or language, or the emotional states or personal judgements of modelers. We invite submissions regarding empirical studies of emotion, cognition, personality traits of modelers as well as studies about activities and communities of modelers, their culture and capabilities. Beyond conventional papers, we also seek to publish study designs, negative results, and, in fact, suggestions for actual studies to be carried out at the workshop.",
							"url" : "http://hufamo.compute.dtu.dk/",
							"organizers" : [
								{
									"name" : "Harald Störrle",
									"email" : "hsto@dtu.dk"
								},
								{
									"name" : "Michel Chaudron",
									"email" : "michel.chaudron@cse.gu.se"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T070000Z",
					"icalEnd" : "20161004T083000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MRT",
							"abstract" : "The complexity of adapting software during runtime has spawned interest in how models can be used to validate, monitor and adapt runtime behaviour. The use of models during runtime extends the use of modeling techniques beyond the design and implementation phases. The goal of this workshop is to look at issues related to developing appropriate model-driven approaches to managing and monitoring the execution of systems. We aim to continue the discussion of research ideas and proposals from researchers who work in relevant areas such as MDE, software architectures, reflection, and autonomic and self-adaptive systems, and provide a “state-of-the-art” research assessment expressed in terms of challenges and achievements.",
							"url" : "http://st.inf.tu-dresden.de/MRT16/",
							"organizers" : [
								{
									"name" : "Sebastian Götz",
									"email" : "sebastian.goetz@acm.org"
								},
								{
									"name" : "Nelly Bencomo",
									"email" : "nelly@acm.org"
								},
								{
									"name" : "Gordon Blair",
									"email" : "gordon@comp.lancs.ac.uk"
								},
								{
									"name" : "Hui Song",
									"email" : "hui.song@sintef.no"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T070000Z",
					"icalEnd" : "20161004T083000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MULTI",
							"abstract" : "As interest in multi-level modelling grows, and the range of multi-level modelling tools expands, there is growing interest in consolidating the key principles of the paradigm and clarifying the essential differences between heterogeneous approaches.  Although multi-level modelling has now been used successfully in a variety of industrial projects and standards initiatives, there is still no clear consensus on what the paradigm actually entails and how it should be applied. For example, there are different views on whether it is sound to combine instance facets and type facets into so-called clabjects, whether strict metamodeling is too restrictive, and what tool architectures provide the best framework for modelling with multiple classification levels. This lack of a foundational consensus is mirrored by the lack of a common focus in current multi-level tools. The goal of MULTI 2016 is to address these challenges and continue the community building established in the previous workshops. In particular, the goal is to encourage the community to delineate different approaches to multi-level modelling and define objective ways to evaluate their respective strengths/weaknesses.",
							"url" : "http://swt4.informatik.uni-mannheim.de/multi-2016/index.html",
							"organizers" : [
								{
									"name" : "Colin Atkinson",
									"email" : "atkinson@informatik.uni-mannheim.de"
								},
								{
									"name" : "Tony Clark",
									"email" : "t.clark@shu.ac.uk"
								},
								{
									"name" : "Georg Grossmann",
									"email" : "georg@cs.unisa.edu.au"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T070000Z",
					"icalEnd" : "20161004T083000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "GEMOC",
							"abstract" : "To cope with complexity, modern software-intensive systems are often split in different concerns to serve the needs of diverse stakeholders. These different concerns are often associated with specialized description languages and technologies, which are based on concern-specific problems and solution concepts. Software developers are thus faced with the challenging task of integrating the different languages and associated technologies used to produce software artifacts in the different concern spaces.\nThe proposed GEMOC 2016 will be a full-day workshop that brings together researchers and practitioners in the modeling languages community to discuss the challenges associated with integrating multiple, heterogeneous modeling languages. The languages of interest range from requirements, to design and runtime languages, and include both general-purpose and domain-specific languages. Challenges related to engineering composable languages, well-formed semantic composition of languages and reasoning about systems described using heterogeneous languages are of particular interest. Following the three previous editions, a major objective is to continue collaborations and to expand a community that is focused on solving the problems arising from the globalization of modeling languages; i.e., the use of multiple DSLs to support coordinated development of diverse aspects of a system.",
							"url" : "http://gemoc.org/gemoc2016/",
							"organizers" : [
								{
									"name" : "Julien Deantoni",
									"email" : "julien.deantoni@polytech.unice.fr"
								},
								{
									"name" : "Jeff Gray",
									"email" : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "09:00",
					"end" : "10:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T070000Z",
					"icalEnd" : "20161004T083000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "SAM",
							"organizers" : [
							]
						}
					]
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "10:30",
					"rowSpan" : 2
				},
				{
					"start" : "10:30",
					"end" : "11:00",
					"rowSpan" : 2,
					"icalStart" : "20161004T083000Z",
					"icalEnd" : "20161004T090000Z",
					"room" : "Rotonde Surcouf",
					"events" : [
						{
							"type" : "CoffeeBreak",
							"title" : "Coffee Break"
						}
					]
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				}
			],
			[],
			[
				{
					"start" : "11:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T090000Z",
					"icalEnd" : "20161004T103000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "ModComp",
							"abstract" : "Model-Driven Engineering (MDE) and Component-Based Software Engineering (CBSE) have been proven to effectively reduce software development complexity by (i) shifting the focus from source code to models and (ii) breaking down the set of desired features and their intricacy into smaller sub-modules, respectively. Moreover, the interplay of MDE and CBSE approaches is gaining recognition as a very promising means to boost the development of software systems by reducing costs and risks and shorten time-to-market. While several attempts to effectively combine MDE and CBSE have been documented, there are still unsolved clashes raising when exploiting interplay of MDE and CBSE, mostly due to mismatches in the related terminology as well as to differences in their basic essence.\nAs satellite event of MoDELS, the goal of ModComp’16 is to gather researchers and practitioners to share opinions, propose solutions to open challenges and generally explore the frontiers of interweaving between MDE and CBSE.",
							"url" : "http://www.mrtc.mdh.se/ModComp16/",
							"organizers" : [
								{
									"name" : "Federico Ciccozzi",
									"email" : "federico.ciccozzi@mdh.se"
								},
								{
									"name" : "Ivano Malavolta",
									"email" : "ivano.malavolta@gssi.infn.it"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T090000Z",
					"icalEnd" : "20161004T103000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "COMMitMDE",
							"abstract" : "Nowadays, collaborative model-driven software engineering (MDSE) is gaining a growing interest in both academia and practice. Goal of COMMitMDE 2016 is to bring together researchers and practitioners in order to investigate together (i) the potential impact of collaborative software engineering methods and principles into MDE practices and (ii) how MDE methods and techniques can support collaborative software engineering activities. Also, COMMitMDE aims at assessing the state of the research and practice on collaborative MDE, creating new synergies between tool vendors, researchers, and practitioners.",
							"url" : "http://cs.gssi.infn.it/commitmde2016",
							"organizers" : [
								{
									"name" : "Henry Muccini",
									"email" : "henry.muccini@univaq.it"
								},
								{
									"name" : "Ivano Malavolta",
									"email" : "ivano.malavolta@gssi.infn.it"
								},
								{
									"name" : "Sébastien Gérard",
									"email" : "sebastien.gerard@cea.fr"
								},
								{
									"name" : "Dimitrios S. Kolovos",
									"email" : "dimitris.kolovos@york.ac.uk"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T090000Z",
					"icalEnd" : "20161004T103000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "HuFaMo",
							"abstract" : "Modeling is a genuinely human enterprise, so many of the questions related to modeling can only be answered by empirical studies of human factors. The HuFaMo workshop series is the premier venue for early stage empirical research involving human factors in modeling. Our goal is to improve the state of the science and professionalism in empirical research in the Model Based Engineering community. Typical examples of such questions might consider the usability of a certain approach such as a method or language, or the emotional states or personal judgements of modelers. We invite submissions regarding empirical studies of emotion, cognition, personality traits of modelers as well as studies about activities and communities of modelers, their culture and capabilities. Beyond conventional papers, we also seek to publish study designs, negative results, and, in fact, suggestions for actual studies to be carried out at the workshop.",
							"url" : "http://hufamo.compute.dtu.dk/",
							"organizers" : [
								{
									"name" : "Harald Störrle",
									"email" : "hsto@dtu.dk"
								},
								{
									"name" : "Michel Chaudron",
									"email" : "michel.chaudron@cse.gu.se"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T090000Z",
					"icalEnd" : "20161004T103000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MRT",
							"abstract" : "The complexity of adapting software during runtime has spawned interest in how models can be used to validate, monitor and adapt runtime behaviour. The use of models during runtime extends the use of modeling techniques beyond the design and implementation phases. The goal of this workshop is to look at issues related to developing appropriate model-driven approaches to managing and monitoring the execution of systems. We aim to continue the discussion of research ideas and proposals from researchers who work in relevant areas such as MDE, software architectures, reflection, and autonomic and self-adaptive systems, and provide a “state-of-the-art” research assessment expressed in terms of challenges and achievements.",
							"url" : "http://st.inf.tu-dresden.de/MRT16/",
							"organizers" : [
								{
									"name" : "Sebastian Götz",
									"email" : "sebastian.goetz@acm.org"
								},
								{
									"name" : "Nelly Bencomo",
									"email" : "nelly@acm.org"
								},
								{
									"name" : "Gordon Blair",
									"email" : "gordon@comp.lancs.ac.uk"
								},
								{
									"name" : "Hui Song",
									"email" : "hui.song@sintef.no"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T090000Z",
					"icalEnd" : "20161004T103000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MULTI",
							"abstract" : "As interest in multi-level modelling grows, and the range of multi-level modelling tools expands, there is growing interest in consolidating the key principles of the paradigm and clarifying the essential differences between heterogeneous approaches.  Although multi-level modelling has now been used successfully in a variety of industrial projects and standards initiatives, there is still no clear consensus on what the paradigm actually entails and how it should be applied. For example, there are different views on whether it is sound to combine instance facets and type facets into so-called clabjects, whether strict metamodeling is too restrictive, and what tool architectures provide the best framework for modelling with multiple classification levels. This lack of a foundational consensus is mirrored by the lack of a common focus in current multi-level tools. The goal of MULTI 2016 is to address these challenges and continue the community building established in the previous workshops. In particular, the goal is to encourage the community to delineate different approaches to multi-level modelling and define objective ways to evaluate their respective strengths/weaknesses.",
							"url" : "http://swt4.informatik.uni-mannheim.de/multi-2016/index.html",
							"organizers" : [
								{
									"name" : "Colin Atkinson",
									"email" : "atkinson@informatik.uni-mannheim.de"
								},
								{
									"name" : "Tony Clark",
									"email" : "t.clark@shu.ac.uk"
								},
								{
									"name" : "Georg Grossmann",
									"email" : "georg@cs.unisa.edu.au"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T090000Z",
					"icalEnd" : "20161004T103000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "GEMOC",
							"abstract" : "To cope with complexity, modern software-intensive systems are often split in different concerns to serve the needs of diverse stakeholders. These different concerns are often associated with specialized description languages and technologies, which are based on concern-specific problems and solution concepts. Software developers are thus faced with the challenging task of integrating the different languages and associated technologies used to produce software artifacts in the different concern spaces.\nThe proposed GEMOC 2016 will be a full-day workshop that brings together researchers and practitioners in the modeling languages community to discuss the challenges associated with integrating multiple, heterogeneous modeling languages. The languages of interest range from requirements, to design and runtime languages, and include both general-purpose and domain-specific languages. Challenges related to engineering composable languages, well-formed semantic composition of languages and reasoning about systems described using heterogeneous languages are of particular interest. Following the three previous editions, a major objective is to continue collaborations and to expand a community that is focused on solving the problems arising from the globalization of modeling languages; i.e., the use of multiple DSLs to support coordinated development of diverse aspects of a system.",
							"url" : "http://gemoc.org/gemoc2016/",
							"organizers" : [
								{
									"name" : "Julien Deantoni",
									"email" : "julien.deantoni@polytech.unice.fr"
								},
								{
									"name" : "Jeff Gray",
									"email" : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "11:00",
					"end" : "12:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T090000Z",
					"icalEnd" : "20161004T103000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "SAM",
							"organizers" : [
							]
						}
					]
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "12:30",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "12:30",
					"end" : "14:00",
					"rowSpan" : 6,
					"icalStart" : "20161004T103000Z",
					"icalEnd" : "20161004T120000Z",
					"room" : "Rotonde J. Cartier",
					"events" : [
						{
							"type" : "Lunch",
							"title" : "Lunch"
						}
					]
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "14:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T120000Z",
					"icalEnd" : "20161004T133000Z",
					"room" : "Bouvet 1",
					"events" : [
						{
							"type" : "SRC",
							"title" : "SRC Talk"
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T120000Z",
					"icalEnd" : "20161004T133000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "ModComp",
							"abstract" : "Model-Driven Engineering (MDE) and Component-Based Software Engineering (CBSE) have been proven to effectively reduce software development complexity by (i) shifting the focus from source code to models and (ii) breaking down the set of desired features and their intricacy into smaller sub-modules, respectively. Moreover, the interplay of MDE and CBSE approaches is gaining recognition as a very promising means to boost the development of software systems by reducing costs and risks and shorten time-to-market. While several attempts to effectively combine MDE and CBSE have been documented, there are still unsolved clashes raising when exploiting interplay of MDE and CBSE, mostly due to mismatches in the related terminology as well as to differences in their basic essence.\nAs satellite event of MoDELS, the goal of ModComp’16 is to gather researchers and practitioners to share opinions, propose solutions to open challenges and generally explore the frontiers of interweaving between MDE and CBSE.",
							"url" : "http://www.mrtc.mdh.se/ModComp16/",
							"organizers" : [
								{
									"name" : "Federico Ciccozzi",
									"email" : "federico.ciccozzi@mdh.se"
								},
								{
									"name" : "Ivano Malavolta",
									"email" : "ivano.malavolta@gssi.infn.it"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T120000Z",
					"icalEnd" : "20161004T133000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "COMMitMDE",
							"abstract" : "Nowadays, collaborative model-driven software engineering (MDSE) is gaining a growing interest in both academia and practice. Goal of COMMitMDE 2016 is to bring together researchers and practitioners in order to investigate together (i) the potential impact of collaborative software engineering methods and principles into MDE practices and (ii) how MDE methods and techniques can support collaborative software engineering activities. Also, COMMitMDE aims at assessing the state of the research and practice on collaborative MDE, creating new synergies between tool vendors, researchers, and practitioners.",
							"url" : "http://cs.gssi.infn.it/commitmde2016",
							"organizers" : [
								{
									"name" : "Henry Muccini",
									"email" : "henry.muccini@univaq.it"
								},
								{
									"name" : "Ivano Malavolta",
									"email" : "ivano.malavolta@gssi.infn.it"
								},
								{
									"name" : "Sébastien Gérard",
									"email" : "sebastien.gerard@cea.fr"
								},
								{
									"name" : "Dimitrios S. Kolovos",
									"email" : "dimitris.kolovos@york.ac.uk"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T120000Z",
					"icalEnd" : "20161004T133000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "HuFaMo",
							"abstract" : "Modeling is a genuinely human enterprise, so many of the questions related to modeling can only be answered by empirical studies of human factors. The HuFaMo workshop series is the premier venue for early stage empirical research involving human factors in modeling. Our goal is to improve the state of the science and professionalism in empirical research in the Model Based Engineering community. Typical examples of such questions might consider the usability of a certain approach such as a method or language, or the emotional states or personal judgements of modelers. We invite submissions regarding empirical studies of emotion, cognition, personality traits of modelers as well as studies about activities and communities of modelers, their culture and capabilities. Beyond conventional papers, we also seek to publish study designs, negative results, and, in fact, suggestions for actual studies to be carried out at the workshop.",
							"url" : "http://hufamo.compute.dtu.dk/",
							"organizers" : [
								{
									"name" : "Harald Störrle",
									"email" : "hsto@dtu.dk"
								},
								{
									"name" : "Michel Chaudron",
									"email" : "michel.chaudron@cse.gu.se"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T120000Z",
					"icalEnd" : "20161004T133000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MRT",
							"abstract" : "The complexity of adapting software during runtime has spawned interest in how models can be used to validate, monitor and adapt runtime behaviour. The use of models during runtime extends the use of modeling techniques beyond the design and implementation phases. The goal of this workshop is to look at issues related to developing appropriate model-driven approaches to managing and monitoring the execution of systems. We aim to continue the discussion of research ideas and proposals from researchers who work in relevant areas such as MDE, software architectures, reflection, and autonomic and self-adaptive systems, and provide a “state-of-the-art” research assessment expressed in terms of challenges and achievements.",
							"url" : "http://st.inf.tu-dresden.de/MRT16/",
							"organizers" : [
								{
									"name" : "Sebastian Götz",
									"email" : "sebastian.goetz@acm.org"
								},
								{
									"name" : "Nelly Bencomo",
									"email" : "nelly@acm.org"
								},
								{
									"name" : "Gordon Blair",
									"email" : "gordon@comp.lancs.ac.uk"
								},
								{
									"name" : "Hui Song",
									"email" : "hui.song@sintef.no"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T120000Z",
					"icalEnd" : "20161004T133000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MULTI",
							"abstract" : "As interest in multi-level modelling grows, and the range of multi-level modelling tools expands, there is growing interest in consolidating the key principles of the paradigm and clarifying the essential differences between heterogeneous approaches.  Although multi-level modelling has now been used successfully in a variety of industrial projects and standards initiatives, there is still no clear consensus on what the paradigm actually entails and how it should be applied. For example, there are different views on whether it is sound to combine instance facets and type facets into so-called clabjects, whether strict metamodeling is too restrictive, and what tool architectures provide the best framework for modelling with multiple classification levels. This lack of a foundational consensus is mirrored by the lack of a common focus in current multi-level tools. The goal of MULTI 2016 is to address these challenges and continue the community building established in the previous workshops. In particular, the goal is to encourage the community to delineate different approaches to multi-level modelling and define objective ways to evaluate their respective strengths/weaknesses.",
							"url" : "http://swt4.informatik.uni-mannheim.de/multi-2016/index.html",
							"organizers" : [
								{
									"name" : "Colin Atkinson",
									"email" : "atkinson@informatik.uni-mannheim.de"
								},
								{
									"name" : "Tony Clark",
									"email" : "t.clark@shu.ac.uk"
								},
								{
									"name" : "Georg Grossmann",
									"email" : "georg@cs.unisa.edu.au"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T120000Z",
					"icalEnd" : "20161004T133000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "GEMOC",
							"abstract" : "To cope with complexity, modern software-intensive systems are often split in different concerns to serve the needs of diverse stakeholders. These different concerns are often associated with specialized description languages and technologies, which are based on concern-specific problems and solution concepts. Software developers are thus faced with the challenging task of integrating the different languages and associated technologies used to produce software artifacts in the different concern spaces.\nThe proposed GEMOC 2016 will be a full-day workshop that brings together researchers and practitioners in the modeling languages community to discuss the challenges associated with integrating multiple, heterogeneous modeling languages. The languages of interest range from requirements, to design and runtime languages, and include both general-purpose and domain-specific languages. Challenges related to engineering composable languages, well-formed semantic composition of languages and reasoning about systems described using heterogeneous languages are of particular interest. Following the three previous editions, a major objective is to continue collaborations and to expand a community that is focused on solving the problems arising from the globalization of modeling languages; i.e., the use of multiple DSLs to support coordinated development of diverse aspects of a system.",
							"url" : "http://gemoc.org/gemoc2016/",
							"organizers" : [
								{
									"name" : "Julien Deantoni",
									"email" : "julien.deantoni@polytech.unice.fr"
								},
								{
									"name" : "Jeff Gray",
									"email" : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "14:00",
					"end" : "15:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T120000Z",
					"icalEnd" : "20161004T133000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "SAM",
							"organizers" : [
							]
						}
					]
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "15:30",
					"rowSpan" : 2
				},
				{
					"start" : "15:30",
					"end" : "16:00",
					"rowSpan" : 2,
					"icalStart" : "20161004T133000Z",
					"icalEnd" : "20161004T140000Z",
					"room" : "Rotonde Surcouf",
					"events" : [
						{
							"type" : "CoffeeBreak",
							"title" : "Coffee Break"
						}
					]
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				}
			],
			[],
			[
				{
					"start" : "16:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T140000Z",
					"icalEnd" : "20161004T153000Z",
					"room" : "Bouvet 1",
					"events" : [
						{
							"type" : "SRC",
							"title" : "SRC Talk"
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T140000Z",
					"icalEnd" : "20161004T153000Z",
					"room" : "Bouvet 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "ModComp",
							"abstract" : "Model-Driven Engineering (MDE) and Component-Based Software Engineering (CBSE) have been proven to effectively reduce software development complexity by (i) shifting the focus from source code to models and (ii) breaking down the set of desired features and their intricacy into smaller sub-modules, respectively. Moreover, the interplay of MDE and CBSE approaches is gaining recognition as a very promising means to boost the development of software systems by reducing costs and risks and shorten time-to-market. While several attempts to effectively combine MDE and CBSE have been documented, there are still unsolved clashes raising when exploiting interplay of MDE and CBSE, mostly due to mismatches in the related terminology as well as to differences in their basic essence.\nAs satellite event of MoDELS, the goal of ModComp’16 is to gather researchers and practitioners to share opinions, propose solutions to open challenges and generally explore the frontiers of interweaving between MDE and CBSE.",
							"url" : "http://www.mrtc.mdh.se/ModComp16/",
							"organizers" : [
								{
									"name" : "Federico Ciccozzi",
									"email" : "federico.ciccozzi@mdh.se"
								},
								{
									"name" : "Ivano Malavolta",
									"email" : "ivano.malavolta@gssi.infn.it"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T140000Z",
					"icalEnd" : "20161004T153000Z",
					"room" : "Charcot",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "COMMitMDE",
							"abstract" : "Nowadays, collaborative model-driven software engineering (MDSE) is gaining a growing interest in both academia and practice. Goal of COMMitMDE 2016 is to bring together researchers and practitioners in order to investigate together (i) the potential impact of collaborative software engineering methods and principles into MDE practices and (ii) how MDE methods and techniques can support collaborative software engineering activities. Also, COMMitMDE aims at assessing the state of the research and practice on collaborative MDE, creating new synergies between tool vendors, researchers, and practitioners.",
							"url" : "http://cs.gssi.infn.it/commitmde2016",
							"organizers" : [
								{
									"name" : "Henry Muccini",
									"email" : "henry.muccini@univaq.it"
								},
								{
									"name" : "Ivano Malavolta",
									"email" : "ivano.malavolta@gssi.infn.it"
								},
								{
									"name" : "Sébastien Gérard",
									"email" : "sebastien.gerard@cea.fr"
								},
								{
									"name" : "Dimitrios S. Kolovos",
									"email" : "dimitris.kolovos@york.ac.uk"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T140000Z",
					"icalEnd" : "20161004T153000Z",
					"room" : "Vauban 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "HuFaMo",
							"abstract" : "Modeling is a genuinely human enterprise, so many of the questions related to modeling can only be answered by empirical studies of human factors. The HuFaMo workshop series is the premier venue for early stage empirical research involving human factors in modeling. Our goal is to improve the state of the science and professionalism in empirical research in the Model Based Engineering community. Typical examples of such questions might consider the usability of a certain approach such as a method or language, or the emotional states or personal judgements of modelers. We invite submissions regarding empirical studies of emotion, cognition, personality traits of modelers as well as studies about activities and communities of modelers, their culture and capabilities. Beyond conventional papers, we also seek to publish study designs, negative results, and, in fact, suggestions for actual studies to be carried out at the workshop.",
							"url" : "http://hufamo.compute.dtu.dk/",
							"organizers" : [
								{
									"name" : "Harald Störrle",
									"email" : "hsto@dtu.dk"
								},
								{
									"name" : "Michel Chaudron",
									"email" : "michel.chaudron@cse.gu.se"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T140000Z",
					"icalEnd" : "20161004T153000Z",
					"room" : "Vauban 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MRT",
							"abstract" : "The complexity of adapting software during runtime has spawned interest in how models can be used to validate, monitor and adapt runtime behaviour. The use of models during runtime extends the use of modeling techniques beyond the design and implementation phases. The goal of this workshop is to look at issues related to developing appropriate model-driven approaches to managing and monitoring the execution of systems. We aim to continue the discussion of research ideas and proposals from researchers who work in relevant areas such as MDE, software architectures, reflection, and autonomic and self-adaptive systems, and provide a “state-of-the-art” research assessment expressed in terms of challenges and achievements.",
							"url" : "http://st.inf.tu-dresden.de/MRT16/",
							"organizers" : [
								{
									"name" : "Sebastian Götz",
									"email" : "sebastian.goetz@acm.org"
								},
								{
									"name" : "Nelly Bencomo",
									"email" : "nelly@acm.org"
								},
								{
									"name" : "Gordon Blair",
									"email" : "gordon@comp.lancs.ac.uk"
								},
								{
									"name" : "Hui Song",
									"email" : "hui.song@sintef.no"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T140000Z",
					"icalEnd" : "20161004T153000Z",
					"room" : "Lamennais 1",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "MULTI",
							"abstract" : "As interest in multi-level modelling grows, and the range of multi-level modelling tools expands, there is growing interest in consolidating the key principles of the paradigm and clarifying the essential differences between heterogeneous approaches.  Although multi-level modelling has now been used successfully in a variety of industrial projects and standards initiatives, there is still no clear consensus on what the paradigm actually entails and how it should be applied. For example, there are different views on whether it is sound to combine instance facets and type facets into so-called clabjects, whether strict metamodeling is too restrictive, and what tool architectures provide the best framework for modelling with multiple classification levels. This lack of a foundational consensus is mirrored by the lack of a common focus in current multi-level tools. The goal of MULTI 2016 is to address these challenges and continue the community building established in the previous workshops. In particular, the goal is to encourage the community to delineate different approaches to multi-level modelling and define objective ways to evaluate their respective strengths/weaknesses.",
							"url" : "http://swt4.informatik.uni-mannheim.de/multi-2016/index.html",
							"organizers" : [
								{
									"name" : "Colin Atkinson",
									"email" : "atkinson@informatik.uni-mannheim.de"
								},
								{
									"name" : "Tony Clark",
									"email" : "t.clark@shu.ac.uk"
								},
								{
									"name" : "Georg Grossmann",
									"email" : "georg@cs.unisa.edu.au"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T140000Z",
					"icalEnd" : "20161004T153000Z",
					"room" : "Lamennais 2",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "GEMOC",
							"abstract" : "To cope with complexity, modern software-intensive systems are often split in different concerns to serve the needs of diverse stakeholders. These different concerns are often associated with specialized description languages and technologies, which are based on concern-specific problems and solution concepts. Software developers are thus faced with the challenging task of integrating the different languages and associated technologies used to produce software artifacts in the different concern spaces.\nThe proposed GEMOC 2016 will be a full-day workshop that brings together researchers and practitioners in the modeling languages community to discuss the challenges associated with integrating multiple, heterogeneous modeling languages. The languages of interest range from requirements, to design and runtime languages, and include both general-purpose and domain-specific languages. Challenges related to engineering composable languages, well-formed semantic composition of languages and reasoning about systems described using heterogeneous languages are of particular interest. Following the three previous editions, a major objective is to continue collaborations and to expand a community that is focused on solving the problems arising from the globalization of modeling languages; i.e., the use of multiple DSLs to support coordinated development of diverse aspects of a system.",
							"url" : "http://gemoc.org/gemoc2016/",
							"organizers" : [
								{
									"name" : "Julien Deantoni",
									"email" : "julien.deantoni@polytech.unice.fr"
								},
								{
									"name" : "Jeff Gray",
									"email" : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					"start" : "16:00",
					"end" : "17:30",
					"rowSpan" : 6,
					"icalStart" : "20161004T140000Z",
					"icalEnd" : "20161004T153000Z",
					"room" : "Lamennais 3",
					"events" : [
						{
							"type" : "Workshop",
							"title" : "SAM",
							"organizers" : [
							]
						}
					]
				}
			],
			[],
			[],
			[],
			[],
			[]
		]
	},
	{
		"name" : "Wednesday, Oct 5, 2016",
		"rooms" : [
			{
				"name" : "Rotonde J. Cartier"
			},
			{
				"name" : "Grand Large"
			},
			{
				"name" : "Chateaubriand",
				"capacity" : 400
			},
			{
				"name" : "Lamennais 4+5",
				"capacity" : 150
			}
		],
		"sessionGroups" : [
			[
				{
					"start" : "08:45",
					"rowSpan" : 1
				},
				{
					"rowSpan" : 1
				},
				{
					"rowSpan" : 1
				},
				{
					"start" : "08:45",
					"end" : "09:00",
					"rowSpan" : 1,
					"icalStart" : "20161005T064500Z",
					"icalEnd" : "20161005T070000Z",
					"room" : "Chateaubriand",
					"events" : [
						{
							"type" : "Opening",
							"title" : "General Chairs Opening"
						}
					]
				},
				{
					"rowSpan" : 1
				}
			],			
			[
				{
					"start" : "09:00",
					"rowSpan" : 1
				},
				{
					"rowSpan" : 1
				},
				{
					"rowSpan" : 1
				},
				{
					"start" : "09:00",
					"end" : "09:15",
					"rowSpan" : 1,
					"icalStart" : "20161005T070000Z",
					"icalEnd" : "20161005T071500Z",
					"room" : "Chateaubriand",
					"events" : [
						{
							"type" : "Opening",
							"title" : "Program Commitee Opening"
						}
					]
				},
				{
					"rowSpan" : 1
				}
			],			
			[
				{
					"start" : "09:15",
					"rowSpan" : 5
				},
				{
					"rowSpan" : 5
				},
				{
					"rowSpan" : 5
				},
				{
					"start" : "09:15",
					"end" : "10:30",
					"rowSpan" : 5,
					"icalStart" : "20161005T071500Z",
					"icalEnd" : "20161005T083000Z",
					"room" : "Chateaubriand",
					"events" : [
						{
							"type" : "Keynote",
							"title" : "Resurrecting Laplace’s Demon: The Case for Deterministic Models",
							"speaker" : {
								"homepage" : "http://ptolemy.eecs.berkeley.edu/~eal/",
								"name" : "Edward A. Lee"	
							}
							,
							"abstract" : " In 1814, Pierre-Simon Laplace published an argument for determinism in the universe, arguing that if someone (a demon) were to know the precise location and momentum of every atom in the universe, then their past and future values for any given time are completely determined and can be calculated from the laws of classical mechanics. This principle, of course, has been roundly invalidated by quantum mechanics, and yet the laws of classical mechanics continue to be extremely useful for prediction.\nIn this talk, I will argue that models plays different (complementary) roles in engineering and science, and that deterministic models have historically proved proved even more valuable in engineering than in science. Moreover, I will show that deterministic models for cyber-physical systems, which combine computation with physical dynamics, remain elusive. I will argue that the next big advance in engineering methods must include deterministic models for CPS, and I will show that such models are both possible and practical. "
						}
					]
				},
				{
					"rowSpan" : 5
				}
			],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "10:30",
					"rowSpan" : 2
				},
				{
					"start" : "10:30",
					"end" : "11:00",
					"rowSpan" : 2,
					"icalStart" : "20161005T083000Z",
					"icalEnd" : "20161005T090000Z",
					"room" : "Rotonde J. Cartier",
					"events" : [
						{
							"type" : "Poster",
							"title" : "Poster"
						}
					]
				},
				{
					"start" : "10:30",
					"end" : "11:00",
					"rowSpan" : 2,
					"icalStart" : "20161005T083000Z",
					"icalEnd" : "20161005T090000Z",
					"room" : "Grand Large",
					"events" : [
						{
							"type" : "CoffeeBreak",
							"title" : "Coffee Break"
						}
					]
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				}
			],
			[],
			[
				{
					"start" : "11:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "12:30",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "12:30",
					"end" : "14:00",
					"rowSpan" : 6,
					"icalStart" : "20161005T103000Z",
					"icalEnd" : "20161005T120000Z",
					"room" : "Grand Large",
					"events" : [
						{
							"type" : "Lunch",
							"title" : "Lunch"
						}
					]
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "14:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "15:30",
					"rowSpan" : 2
				},
				{
					"start" : "15:30",
					"end" : "16:00",
					"rowSpan" : 2,
					"icalStart" : "20161005T133000Z",
					"icalEnd" : "20161005T140000Z",
					"room" : "Rotonde J. Cartier",
					"events" : [
						{
							"type" : "Poster",
							"title" : "Poster"
						}
					]
				},
				{
					"start" : "15:30",
					"end" : "16:00",
					"rowSpan" : 2,
					"icalStart" : "20161005T133000Z",
					"icalEnd" : "20161005T140000Z",
					"room" : "Grand Large",
					"events" : [
						{
							"type" : "CoffeeBreak",
							"title" : "Coffee Break"
						}
					]
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				}
			],
			[],
			[
				{
					"start" : "16:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "17:30",
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"start" : "17:30",
					"end" : "19:30",
					"rowSpan" : 8,
					"icalStart" : "20161005T153000Z",
					"icalEnd" : "20161005T173000Z",
					"room" : "Lamennais 4+5",
					"events" : [
						{
							"type" : "Meeting",
							"title" : "MODELS Steering Commitee Meeting"
						}
					]
				}
			],
			[],
			[
				{
					"start" : "18:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "18:00",
					"end" : "00:00",
					"rowSpan" : 24,
					"icalStart" : "20161005T160000Z",
					"icalEnd" : "20161004T220000Z",
					"room" : "Grand Large",
					"events" : [
						{
							"type" : "Reception",
							"title" : "Conference Welcome Reception and SRC Awards"
						}
					]
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "19:30",
					"rowSpan" : 18
				},
				{
					"rowSpan" : 18
				},
				{
					"rowSpan" : 18
				},
				{
					"rowSpan" : 18
				}
			],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[]
		]
	},
	{
		"name" : "Thursday, Oct 6, 2016",
		"rooms" : [
			{
				"name" : "Rotonde J. Cartier"
			},
			{
				"name" : "Grand Large"
			},
			{
				"name" : "Chateaubriand",
				"capacity" : 400
			},
			{
				"name" : "Lamennais 4+5",
				"capacity" : 150
			}
		],
		"sessionGroups" : [
			[
				{
					"start" : "09:00",
					"rowSpan" : 1
				},
				{
					"start" : "09:00",
					"end" : "12:30",
					"rowSpan" : 14,
					"icalStart" : "20161006T070000Z",
					"icalEnd" : "20161006T103000Z",
					"room" : "Rotonde J. Cartier",
					"events" : [
						{
							"type" : "Clinic",
							"title" : "Clinic"
						}
					]
				},
				{
					"rowSpan" : 1
				},
				{
					"start" : "09:00",
					"end" : "09:15",
					"rowSpan" : 1,
					"icalStart" : "20161006T070000Z",
					"icalEnd" : "20161006T071500Z",
					"room" : "Chateaubriand",
					"events" : [
						{
							"type" : "Opening",
							"title" : "General Chairs Opening"
						}
					]
				},
				{
					"rowSpan" : 1
				}
			],			
			[
				{
					"start" : "09:15",
					"rowSpan" : 5
				},
				{
					"rowSpan" : 5
				},
				{
					"start" : "09:15",
					"end" : "10:30",
					"rowSpan" : 5,
					"icalStart" : "20161006T071500Z",
					"icalEnd" : "20161006T083000Z",
					"room" : "Chateaubriand",
					"events" : [
						{
							"type" : "Keynote",
							"title" : "Keynote 2",
							"speaker" : {
								"homepage" : "http://www.research.lancs.ac.uk/portal/en/people/gordon-blair",
								"name" : "Gordon Blair"	
							}
							}
					]
				},
				{
					"rowSpan" : 5
				}
			],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "10:30",
					"rowSpan" : 2
				},
				{
					"start" : "10:30",
					"end" : "11:00",
					"rowSpan" : 2,
					"icalStart" : "20161006T083000Z",
					"icalEnd" : "20161006T090000Z",
					"room" : "Grand Large",
					"events" : [
						{
							"type" : "Poster",
							"title" : "Poster"
						},
						{
							"type" : "CoffeeBreak",
							"title" : "Coffee Break"
						}
					]
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				}
			],
			[],
			[
				{
					"start" : "11:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "12:30",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "12:30",
					"end" : "14:00",
					"rowSpan" : 6,
					"icalStart" : "20161006T103000Z",
					"icalEnd" : "20161006T120000Z",
					"room" : "Grand Large",
					"events" : [
						{
							"type" : "Lunch",
							"title" : "Lunch"
						}
					]
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "14:00",
					"rowSpan" : 6
				},
				{
					"start" : "14:00",
					"end" : "17:30",
					"rowSpan" : 14,
					"icalStart" : "20161006T120000Z",
					"icalEnd" : "20161006T153000Z",
					"room" : "Rotonde J. Cartier",
					"events" : [
						{
							"type" : "Clinic",
							"title" : "Clinic"
						}
					]
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "15:30",
					"rowSpan" : 2
				},
				{
					"start" : "15:30",
					"end" : "16:00",
					"rowSpan" : 2,
					"icalStart" : "20161006T133000Z",
					"icalEnd" : "20161006T140000Z",
					"room" : "Grand Large",
					"events" : [
						{
							"type" : "Poster",
							"title" : "Poster"
						},
						{
							"type" : "CoffeeBreak",
							"title" : "Coffee Break"
						}
					]
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				}
			],
			[],
			[
				{
					"start" : "16:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "17:30",
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"rowSpan" : 2
				},
				{
					"start" : "17:30",
					"end" : "19:30",
					"rowSpan" : 8,
					"icalStart" : "20161006T153000Z",
					"icalEnd" : "20161006T173000Z",
					"room" : "Lamennais 4+5",
					"events" : [
						{
							"type" : "Meeting",
							"title" : "SoSyM Editorial Board Meeting"
						}
					]
				}
			],
			[],
			[
				{
					"start" : "18:00",
					"rowSpan" : 6
				},
				{
					"rowSpan" : 6
				},
				{
					"start" : "18:00",
					"end" : "00:00",
					"rowSpan" : 24,
					"icalStart" : "20161006T160000Z",
					"icalEnd" : "20161005T220000Z",
					"room" : "Grand Large",
					"events" : [
						{
							"type" : "Reception",
							"title" : "Gala Dinner"
						}
					]
				},
				{
					"rowSpan" : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "19:30",
					"rowSpan" : 18
				},
				{
					"rowSpan" : 18
				},
				{
					"rowSpan" : 18
				},
				{
					"rowSpan" : 18
				}
			],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[],
			[]
		]
	},
	{
		"name" : "Friday, Oct 7, 2016",
		"rooms" : [
			{
				"name" : "Rotonde J. Cartier"
			},
			{
				"name" : "Grand Large"
			},
			{
				"name" : "Chateaubriand",
				"capacity" : 400
			}
		],
		"sessionGroups" : [
			[
				{
					"start" : "09:00",
					"rowSpan" : 1
				},
				{
					"rowSpan" : 1
				},
				{
					"rowSpan" : 1
				},
				{
					"start" : "09:00",
					"end" : "09:15",
					"rowSpan" : 1,
					"icalStart" : "20161007T070000Z",
					"icalEnd" : "20161007T071500Z",
					"room" : "Chateaubriand",
					"events" : [
						{
							"type" : "Opening",
							"title" : "General Chairs Opening"
						}
					]
				}
			],			
			[
				{
					"start" : "09:15",
					"rowSpan" : 5
				},
				{
					"rowSpan" : 5
				},
				{
					"rowSpan" : 5
				},
				{
					"start" : "09:15",
					"end" : "10:30",
					"rowSpan" : 5,
					"icalStart" : "20161007T071500Z",
					"icalEnd" : "20161007T083000Z",
					"room" : "Chateaubriand",
					"events" : [
						{
							"type" : "Keynote",
							"title" : "The Straight Line is Ungodly",
							"speaker" : {
								"homepage" : "https://sites.google.com/a/gertrudandcope.com/www/jimcoplien",
								"name" : "Jim Coplien"	
							}
							,
							"abstract" : " Model-based approaches are not thriving, and the blame is usually laid at the feet of the unsophistication of software engineers. Yet software engineers may tacitly know something that the formal folks seldom discuss: Software systems are complex, and it is only simple problems that yield to formal approaches, including most modeling approaches—especially the analytical and computer-supported ones.\nA system is complex proportional to its number of distinct, meaningful tops. However, these « tops » are rarely separable, so independent models based on such formalisms are relatively impotent. And such models are abstractions (i.e., they discard information) to the degree they are formal: and Gödel, Heisenberg, Rosen and a host of others note that there’s always a ghost in the machine. This matters more and more as we face increased complexity.\nI will propose that modeling efforts be redirected to the more realistic, logically inconsistent, human ways of understanding ourselves and our interactions with computers. Object-orientation started with Kay’s operational models that would become objects; we see them again in Model-View-Controller-User. Both of these approaches emphasize the need to mix multiple concurrent perspectives (called roles) when analyzing a system. DCI is one paradigm that provides a single computational model while accommodating “tops” for both the left and right brain, and it bridges the abstraction of modeling with concrete implementation. I will argue that design is less about reifying extrinsic, abstract models than it is about creating a “habitable » reality close to the implementation, guided by human mental models. Last, I’ll touch on the kinds of socially constructed complex models as we find in patterns, which were explicitly created out of a dissatisfaction with the ability of formal models to add value."
						}
					]
				}
			],
			[],
			[],
			[],
			[],
			[
				{
					"start" : "10:30",
					"rowSpan" : 2
				},
				{
					"start" : "10:30",
					"end" : "11:00",
					"rowSpan" : 2,
					"icalStart" : "20161007T083000Z",
					"icalEnd" : "20161007T090000Z",
					"room" : "Rotonde J. Cartier",
					"events" : [
						{
							"type" : "Poster",
							"title" : "Poster"
						}
					]
				},
				{
					"start" : "10:30",
					"end" : "11:00",
					"rowSpan" : 2,
					"icalStart" : "20161007T083000Z",
					"icalEnd" : "20161007T090000Z",
					"room" : "Grand Large",
					"events" : [
						{
							"type" : "CoffeeBreak",
							"title" : "Coffee Break"
						}
					]
				},
				{
					"rowSpan" : 2
				}
			],
			[]
		]
	}
]
