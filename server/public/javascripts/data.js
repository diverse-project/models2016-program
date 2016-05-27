var data = [
	{
		name : "Sunday",
		date : "20161002",
		rooms : [
			{
				name : "Rotonde Surcouf"
			},
			{
				name : "Rotonde J. Cartier"
			},
			{
				name : "Bouvet 1",
				capacity : "45"
			},
			{
				name : "Bouvet 2",
				capacity : "45"
			},
			{
				name : "Charcot",
				capacity : "54"
			},
			{
				name : "Vauban 1",
				capacity : "50"
			},
			{
				name : "Vauban 2",
				capacity : "60"
			},
			{
				name : "Lamennais 1",
				capacity : "80"
			},
			{
				name : "Lamennais 2",
				capacity : "80"
			},
			{
				name : "Lamennais 3",
				capacity : "80"
			}
		],
		sessionGroups : [
			[
				{
					start : "09:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161002T070000Z",
					icalEnd : "20161002T083000Z",
					room : "Bouvet 1",
					events : [
						{
							type : "DoctoralSymposium",
							title : "Doctoral Symposium",
							organizers : [
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161002T070000Z",
					icalEnd : "20161002T083000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Tutorial",
							title : "Advanced Model Management with Epsilon",
							organizers : [
								{
									name : "Richard Paige"
								},
								{
									name : "Dimitris Kolovos"
								},
								{
									name : "Antonio Garcia-Dominguez"
								},
								{
									name : "Nicholas Matragkas"
								},
								{
									name : "Horacio Hoyos"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161002T070000Z",
					icalEnd : "20161002T083000Z",
					room : "Charcot",
					events : [
						{
							type : "Tutorial",
							title : "ARCADIA in a Nutshell",
							organizers : [
								{
									name : "Pascal Roques"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161002T070000Z",
					icalEnd : "20161002T083000Z",
					room : "Vauban 1",
					events : [
						{
							type : "Tutorial",
							title : "Hybrid Graphical/Textual Modelling and Code Generation with PapyrusRT",
							organizers : [
								{
									name : "Ernesto Posse"
								},
								{
									name : "Nicolas Hili"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161002T070000Z",
					icalEnd : "20161002T083000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "ME",
							abstract : "Software artefacts constantly increase in complexity, variety and novelty. Environment and business constraints, user requirements and new insights put additional pressure on their adaptability, availability, reliability and quality: they continuously need to be up to date and up to level. However, evolution issues are critical, complex and costly to manage. They concern requirements, architecture, design, source code, documentation, integration as well as deployment. They also typically affect various kinds of models (data, behavioural, domain, source code or goal models). Addressing and managing these varieties of changes is essential. Models and meta-models, the cornerstone of complex software systems’ abstraction, represent a powerful mean for facing software evolution challenges by ensuring a more abstract and expressive modelling of software evolution. They can help and guide software evolution, and can enforce and reduce critical risks and important involved resources. The workshop puts the focus on Models and Evolution by considering two main sides:\n(1) Managing software evolution needs by relying on the high-level abstraction power of models and meta-models.\n(2) Managing models and metamodels evolution needs by putting attention to their increasing evolution issues as they become primary artefacts and to the need of co-evolution of all related software artefacts.",
							url : "http://www.models-and-evolution.com/",
							organizers : [
								{
									name : "Dalila Tamzalit",
									email : "Dalila.Tamzalit@univnantes.fr"
								},
								{
									name : "Alfonso Pierantonio",
									email : "alfonso.pierantonio@univaq.it"
								},
								{
									name : "Bernhard Schätz",
									email : "schaetz@fortiss.org"
								},
								{
									name : "Tanja Mayerhofer",
									email : "mayerhofer@big.tuwien.ac.at"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161002T070000Z",
					icalEnd : "20161002T083000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "OCL",
							abstract : "Limitations of graphical notations encourage the development of text-based modeling languages that either integrate with or replace graphical notations for modeling. Typical examples of such languages are OCL, textual MOF, Epsilon, and Alloy. The goal of this workshop is to create a forum where researchers and practitioners interested in building models using OCL or other kinds of textual languages can directly interact, report advances, share results, discuss appropriate standards and showcase tools on any aspect of textual modeling and analysis.",
							url : "http://oclworkshop.github.io/2016/",
							organizers : [
								{
									name : "Achim D. Brucker",
									email : "a.brucker@sheffield.ac.uk"
								},
								{
									name : "Jordi Cabot",
									email : "jordi.cabot@icrea.cat"
								},
								{
									name : "Adolfo Sanchez-Barbudo Herrera",
									email : "asbh500@cs.york.uk"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161002T070000Z",
					icalEnd : "20161002T083000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "FlexMDE",
							abstract : "Over the last years, numerous modeling platforms have been developed to simplify and automate many steps of Model Driven Engineering (MDE) processes. However, still several challenges have to be solved for enabling a wider adoption of MDE. One of the most important impediments in adopting MDE tools is related to the reduced flexibility of existing modeling platforms that do not permit to relax or enforce their rigidity depending on the stages of the applied development process. For instance, EMF does not permit to enter models which are not conforming to a metamodel. On one hand this allows only valid models to be defined, but on the other, it makes the corresponding pragmatics more difficult. Thus there is an increasing need for techniques supporting flexibility in a wide range of modeling activities, including metamodel, model, and model transformation development and reuse. The workshop aims at identifying the difficulties in the current practice of MDE related to the lack of flexibility, and soliciting contributions of ideas, concepts, and techniques also from other areas of software development which could be useful to revise certain MDE fundamental typing concepts, to facilitate flexible reuse of MDE artefacts, and to define agile model sketching techniques.",
							url : "http://www.di.univaq.it/flexmde/",
							organizers : [
								{
									name : "Davide Di Ruscio",
									email : "davide.diruscio@univaq.it"
								},
								{
									name : "Alfonso Pierantonio",
									email : "alfonso.pierantonio@univaq.it"
								},
								{
									name : "Juan De Lara",
									email : "Juan.deLara@uam.es"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161002T070000Z",
					icalEnd : "20161002T083000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "VOLT",
							abstract : "Model transformations are everywhere in software development, implicitly or explicitly. They have been described as “the heart and soul of Model-Driven Development (MDD)”. Several experts have identified the verification of model transformations as one of the grand challenges of MDD. Despite some recent activity in the field, the work on the verification of model transformations remains scattered and a clear perspective on the subject is still not in sight. Furthermore, current model transformation tools most often lack verification techniques to support such activities. The Fifth International Workshop on the Verification Of modeL Transformation is one of the most accurate venues to offer researchers a dedicated forum to classify, discuss, propose, and advance verification techniques dedicated to model transformations. VOLT promotes discussions between theoreticians and practitioners from academy and industry, given its ideal co-location with MODELS. VOLT’s interest spans both to academic and industrial practices. One of the goals of the forum is to collect enough industrial case studies so that those problems can be stated at a theoretical level.",
							url : "http://www-ens.iro.umontreal.ca/~syriani/volt2016/",
							organizers : [
								{
									name : "Moussa Amrani",
									email : "moussa.amrani@unamur.be"
								},
								{
									name : "Eugene Syriani",
									email : "syriani@iro.umontreal.ca"
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
					start : "10:30",
					rowSpan : 2
				},
				{
					start : "10:30",
					end : "11:00",
					rowSpan : 2,
					icalStart : "20161002T083000Z",
					icalEnd : "20161002T090000Z",
					room : "Rotonde Surcouf",
					events : [
						{
							type : "CoffeeBreak",
							title : "Coffee Break"
						}
					]
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				}
			],
			[],
			[
				{
					start : "11:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161002T090000Z",
					icalEnd : "20161002T103000Z",
					room : "Bouvet 1",
					events : [
						{
							type : "DoctoralSymposium",
							title : "Doctoral Symposium",
							organizers : [
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161002T090000Z",
					icalEnd : "20161002T103000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Tutorial",
							title : "Advanced Model Management with Epsilon",
							organizers : [
								{
									name : "Richard Paige"
								},
								{
									name : "Dimitris Kolovos"
								},
								{
									name : "Antonio Garcia-Dominguez"
								},
								{
									name : "Nicholas Matragkas"
								},
								{
									name : "Horacio Hoyos"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161002T090000Z",
					icalEnd : "20161002T103000Z",
					room : "Charcot",
					events : [
						{
							type : "Tutorial",
							title : "ARCADIA in a Nutshell",
							organizers : [
								{
									name : "Pascal Roques"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161002T090000Z",
					icalEnd : "20161002T103000Z",
					room : "Vauban 1",
					events : [
						{
							type : "Tutorial",
							title : "Hybrid Graphical/Textual Modelling and Code Generation with PapyrusRT",
							organizers : [
								{
									name : "Ernesto Posse"
								},
								{
									name : "Nicolas Hili"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161002T090000Z",
					icalEnd : "20161002T103000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "ME",
							abstract : "Software artefacts constantly increase in complexity, variety and novelty. Environment and business constraints, user requirements and new insights put additional pressure on their adaptability, availability, reliability and quality: they continuously need to be up to date and up to level. However, evolution issues are critical, complex and costly to manage. They concern requirements, architecture, design, source code, documentation, integration as well as deployment. They also typically affect various kinds of models (data, behavioural, domain, source code or goal models). Addressing and managing these varieties of changes is essential. Models and meta-models, the cornerstone of complex software systems’ abstraction, represent a powerful mean for facing software evolution challenges by ensuring a more abstract and expressive modelling of software evolution. They can help and guide software evolution, and can enforce and reduce critical risks and important involved resources. The workshop puts the focus on Models and Evolution by considering two main sides:\n(1) Managing software evolution needs by relying on the high-level abstraction power of models and meta-models.\n(2) Managing models and metamodels evolution needs by putting attention to their increasing evolution issues as they become primary artefacts and to the need of co-evolution of all related software artefacts.",
							url : "http://www.models-and-evolution.com/",
							organizers : [
								{
									name : "Dalila Tamzalit",
									email : "Dalila.Tamzalit@univnantes.fr"
								},
								{
									name : "Alfonso Pierantonio",
									email : "alfonso.pierantonio@univaq.it"
								},
								{
									name : "Bernhard Schätz",
									email : "schaetz@fortiss.org"
								},
								{
									name : "Tanja Mayerhofer",
									email : "mayerhofer@big.tuwien.ac.at"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161002T090000Z",
					icalEnd : "20161002T103000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "OCL",
							abstract : "Limitations of graphical notations encourage the development of text-based modeling languages that either integrate with or replace graphical notations for modeling. Typical examples of such languages are OCL, textual MOF, Epsilon, and Alloy. The goal of this workshop is to create a forum where researchers and practitioners interested in building models using OCL or other kinds of textual languages can directly interact, report advances, share results, discuss appropriate standards and showcase tools on any aspect of textual modeling and analysis.",
							url : "http://oclworkshop.github.io/2016/",
							organizers : [
								{
									name : "Achim D. Brucker",
									email : "a.brucker@sheffield.ac.uk"
								},
								{
									name : "Jordi Cabot",
									email : "jordi.cabot@icrea.cat"
								},
								{
									name : "Adolfo Sanchez-Barbudo Herrera",
									email : "asbh500@cs.york.uk"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161002T090000Z",
					icalEnd : "20161002T103000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "FlexMDE",
							abstract : "Over the last years, numerous modeling platforms have been developed to simplify and automate many steps of Model Driven Engineering (MDE) processes. However, still several challenges have to be solved for enabling a wider adoption of MDE. One of the most important impediments in adopting MDE tools is related to the reduced flexibility of existing modeling platforms that do not permit to relax or enforce their rigidity depending on the stages of the applied development process. For instance, EMF does not permit to enter models which are not conforming to a metamodel. On one hand this allows only valid models to be defined, but on the other, it makes the corresponding pragmatics more difficult. Thus there is an increasing need for techniques supporting flexibility in a wide range of modeling activities, including metamodel, model, and model transformation development and reuse. The workshop aims at identifying the difficulties in the current practice of MDE related to the lack of flexibility, and soliciting contributions of ideas, concepts, and techniques also from other areas of software development which could be useful to revise certain MDE fundamental typing concepts, to facilitate flexible reuse of MDE artefacts, and to define agile model sketching techniques.",
							url : "http://www.di.univaq.it/flexmde/",
							organizers : [
								{
									name : "Davide Di Ruscio",
									email : "davide.diruscio@univaq.it"
								},
								{
									name : "Alfonso Pierantonio",
									email : "alfonso.pierantonio@univaq.it"
								},
								{
									name : "Juan De Lara",
									email : "Juan.deLara@uam.es"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161002T090000Z",
					icalEnd : "20161002T103000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "VOLT",
							abstract : "Model transformations are everywhere in software development, implicitly or explicitly. They have been described as “the heart and soul of Model-Driven Development (MDD)”. Several experts have identified the verification of model transformations as one of the grand challenges of MDD. Despite some recent activity in the field, the work on the verification of model transformations remains scattered and a clear perspective on the subject is still not in sight. Furthermore, current model transformation tools most often lack verification techniques to support such activities. The Fifth International Workshop on the Verification Of modeL Transformation is one of the most accurate venues to offer researchers a dedicated forum to classify, discuss, propose, and advance verification techniques dedicated to model transformations. VOLT promotes discussions between theoreticians and practitioners from academy and industry, given its ideal co-location with MODELS. VOLT’s interest spans both to academic and industrial practices. One of the goals of the forum is to collect enough industrial case studies so that those problems can be stated at a theoretical level.",
							url : "http://www-ens.iro.umontreal.ca/~syriani/volt2016/",
							organizers : [
								{
									name : "Moussa Amrani",
									email : "moussa.amrani@unamur.be"
								},
								{
									name : "Eugene Syriani",
									email : "syriani@iro.umontreal.ca"
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
					start : "12:30",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "12:30",
					end : "14:00",
					rowSpan : 6,
					icalStart : "20161002T103000Z",
					icalEnd : "20161002T120000Z",
					room : "Rotonde J. Cartier",
					events : [
						{
							type : "Lunch",
							title : "Lunch"
						}
					]
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					start : "14:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161002T120000Z",
					icalEnd : "20161002T133000Z",
					room : "Bouvet 1",
					events : [
						{
							type : "DoctoralSymposium",
							title : "Doctoral Symposium",
							organizers : [
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161002T120000Z",
					icalEnd : "20161002T133000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Tutorial",
							title : "Modeling Reactive Systems with the Scenario Modeling Language and ScenarioTools",
							organizers : [
								{
									name : "Joel Greenyer"
								},
								{
									name : "Daniel Gritzner"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161002T120000Z",
					icalEnd : "20161002T133000Z",
					room : "Charcot",
					events : [
						{
							type : "Tutorial",
							title : "Creating a Domain-Specific Graphical Modeling Workbench with Eclipse Technologies",
							organizers : [
								{
									name : "Frederic Madiot"
								},
								{
									name : "Cedric Brun"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161002T120000Z",
					icalEnd : "20161002T133000Z",
					room : "Vauban 1",
					events : [
						{
							type : "Tutorial",
							title : "Technologies and Design Patterns for Model-based Development of Cyber-physical Systems",
							organizers : [
								{
									name : "Bran Selic"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161002T120000Z",
					icalEnd : "20161002T133000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "ME",
							abstract : "Software artefacts constantly increase in complexity, variety and novelty. Environment and business constraints, user requirements and new insights put additional pressure on their adaptability, availability, reliability and quality: they continuously need to be up to date and up to level. However, evolution issues are critical, complex and costly to manage. They concern requirements, architecture, design, source code, documentation, integration as well as deployment. They also typically affect various kinds of models (data, behavioural, domain, source code or goal models). Addressing and managing these varieties of changes is essential. Models and meta-models, the cornerstone of complex software systems’ abstraction, represent a powerful mean for facing software evolution challenges by ensuring a more abstract and expressive modelling of software evolution. They can help and guide software evolution, and can enforce and reduce critical risks and important involved resources. The workshop puts the focus on Models and Evolution by considering two main sides:\n(1) Managing software evolution needs by relying on the high-level abstraction power of models and meta-models.\n(2) Managing models and metamodels evolution needs by putting attention to their increasing evolution issues as they become primary artefacts and to the need of co-evolution of all related software artefacts.",
							url : "http://www.models-and-evolution.com/",
							organizers : [
								{
									name : "Dalila Tamzalit",
									email : "Dalila.Tamzalit@univnantes.fr"
								},
								{
									name : "Alfonso Pierantonio",
									email : "alfonso.pierantonio@univaq.it"
								},
								{
									name : "Bernhard Schätz",
									email : "schaetz@fortiss.org"
								},
								{
									name : "Tanja Mayerhofer",
									email : "mayerhofer@big.tuwien.ac.at"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161002T120000Z",
					icalEnd : "20161002T133000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "OCL",
							abstract : "Limitations of graphical notations encourage the development of text-based modeling languages that either integrate with or replace graphical notations for modeling. Typical examples of such languages are OCL, textual MOF, Epsilon, and Alloy. The goal of this workshop is to create a forum where researchers and practitioners interested in building models using OCL or other kinds of textual languages can directly interact, report advances, share results, discuss appropriate standards and showcase tools on any aspect of textual modeling and analysis.",
							url : "http://oclworkshop.github.io/2016/",
							organizers : [
								{
									name : "Achim D. Brucker",
									email : "a.brucker@sheffield.ac.uk"
								},
								{
									name : "Jordi Cabot",
									email : "jordi.cabot@icrea.cat"
								},
								{
									name : "Adolfo Sanchez-Barbudo Herrera",
									email : "asbh500@cs.york.uk"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161002T120000Z",
					icalEnd : "20161002T133000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "FlexMDE",
							abstract : "Over the last years, numerous modeling platforms have been developed to simplify and automate many steps of Model Driven Engineering (MDE) processes. However, still several challenges have to be solved for enabling a wider adoption of MDE. One of the most important impediments in adopting MDE tools is related to the reduced flexibility of existing modeling platforms that do not permit to relax or enforce their rigidity depending on the stages of the applied development process. For instance, EMF does not permit to enter models which are not conforming to a metamodel. On one hand this allows only valid models to be defined, but on the other, it makes the corresponding pragmatics more difficult. Thus there is an increasing need for techniques supporting flexibility in a wide range of modeling activities, including metamodel, model, and model transformation development and reuse. The workshop aims at identifying the difficulties in the current practice of MDE related to the lack of flexibility, and soliciting contributions of ideas, concepts, and techniques also from other areas of software development which could be useful to revise certain MDE fundamental typing concepts, to facilitate flexible reuse of MDE artefacts, and to define agile model sketching techniques.",
							url : "http://www.di.univaq.it/flexmde/",
							organizers : [
								{
									name : "Davide Di Ruscio",
									email : "davide.diruscio@univaq.it"
								},
								{
									name : "Alfonso Pierantonio",
									email : "alfonso.pierantonio@univaq.it"
								},
								{
									name : "Juan De Lara",
									email : "Juan.deLara@uam.es"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161002T120000Z",
					icalEnd : "20161002T133000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "VOLT",
							abstract : "Model transformations are everywhere in software development, implicitly or explicitly. They have been described as “the heart and soul of Model-Driven Development (MDD)”. Several experts have identified the verification of model transformations as one of the grand challenges of MDD. Despite some recent activity in the field, the work on the verification of model transformations remains scattered and a clear perspective on the subject is still not in sight. Furthermore, current model transformation tools most often lack verification techniques to support such activities. The Fifth International Workshop on the Verification Of modeL Transformation is one of the most accurate venues to offer researchers a dedicated forum to classify, discuss, propose, and advance verification techniques dedicated to model transformations. VOLT promotes discussions between theoreticians and practitioners from academy and industry, given its ideal co-location with MODELS. VOLT’s interest spans both to academic and industrial practices. One of the goals of the forum is to collect enough industrial case studies so that those problems can be stated at a theoretical level.",
							url : "http://www-ens.iro.umontreal.ca/~syriani/volt2016/",
							organizers : [
								{
									name : "Moussa Amrani",
									email : "moussa.amrani@unamur.be"
								},
								{
									name : "Eugene Syriani",
									email : "syriani@iro.umontreal.ca"
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
					start : "15:30",
					rowSpan : 2
				},
				{
					start : "15:30",
					end : "16:00",
					rowSpan : 2,
					icalStart : "20161002T133000Z",
					icalEnd : "20161002T140000Z",
					room : "Rotonde Surcouf",
					events : [
						{
							type : "CoffeeBreak",
							title : "Coffee Break"
						}
					]
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				}
			],
			[],
			[
				{
					start : "16:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161002T140000Z",
					icalEnd : "20161002T153000Z",
					room : "Bouvet 1",
					events : [
						{
							type : "DoctoralSymposium",
							title : "Doctoral Symposium",
							organizers : [
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161002T140000Z",
					icalEnd : "20161002T153000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Tutorial",
							title : "Modeling Reactive Systems with the Scenario Modeling Language and ScenarioTools",
							organizers : [
								{
									name : "Joel Greenyer"
								},
								{
									name : "Daniel Gritzner"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161002T140000Z",
					icalEnd : "20161002T153000Z",
					room : "Charcot",
					events : [
						{
							type : "Tutorial",
							title : "Creating a Domain-Specific Graphical Modeling Workbench with Eclipse Technologies",
							organizers : [
								{
									name : "Frederic Madiot"
								},
								{
									name : "Cedric Brun"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161002T140000Z",
					icalEnd : "20161002T153000Z",
					room : "Vauban 1",
					events : [
						{
							type : "Tutorial",
							title : "Technologies and Design Patterns for Model-based Development of Cyber-physical Systems",
							organizers : [
								{
									name : "Bran Selic"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161002T140000Z",
					icalEnd : "20161002T153000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "ME",
							abstract : "Software artefacts constantly increase in complexity, variety and novelty. Environment and business constraints, user requirements and new insights put additional pressure on their adaptability, availability, reliability and quality: they continuously need to be up to date and up to level. However, evolution issues are critical, complex and costly to manage. They concern requirements, architecture, design, source code, documentation, integration as well as deployment. They also typically affect various kinds of models (data, behavioural, domain, source code or goal models). Addressing and managing these varieties of changes is essential. Models and meta-models, the cornerstone of complex software systems’ abstraction, represent a powerful mean for facing software evolution challenges by ensuring a more abstract and expressive modelling of software evolution. They can help and guide software evolution, and can enforce and reduce critical risks and important involved resources. The workshop puts the focus on Models and Evolution by considering two main sides:\n(1) Managing software evolution needs by relying on the high-level abstraction power of models and meta-models.\n(2) Managing models and metamodels evolution needs by putting attention to their increasing evolution issues as they become primary artefacts and to the need of co-evolution of all related software artefacts.",
							url : "http://www.models-and-evolution.com/",
							organizers : [
								{
									name : "Dalila Tamzalit",
									email : "Dalila.Tamzalit@univnantes.fr"
								},
								{
									name : "Alfonso Pierantonio",
									email : "alfonso.pierantonio@univaq.it"
								},
								{
									name : "Bernhard Schätz",
									email : "schaetz@fortiss.org"
								},
								{
									name : "Tanja Mayerhofer",
									email : "mayerhofer@big.tuwien.ac.at"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161002T140000Z",
					icalEnd : "20161002T153000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "OCL",
							abstract : "Limitations of graphical notations encourage the development of text-based modeling languages that either integrate with or replace graphical notations for modeling. Typical examples of such languages are OCL, textual MOF, Epsilon, and Alloy. The goal of this workshop is to create a forum where researchers and practitioners interested in building models using OCL or other kinds of textual languages can directly interact, report advances, share results, discuss appropriate standards and showcase tools on any aspect of textual modeling and analysis.",
							url : "http://oclworkshop.github.io/2016/",
							organizers : [
								{
									name : "Achim D. Brucker",
									email : "a.brucker@sheffield.ac.uk"
								},
								{
									name : "Jordi Cabot",
									email : "jordi.cabot@icrea.cat"
								},
								{
									name : "Adolfo Sanchez-Barbudo Herrera",
									email : "asbh500@cs.york.uk"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161002T140000Z",
					icalEnd : "20161002T153000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "FlexMDE",
							abstract : "Over the last years, numerous modeling platforms have been developed to simplify and automate many steps of Model Driven Engineering (MDE) processes. However, still several challenges have to be solved for enabling a wider adoption of MDE. One of the most important impediments in adopting MDE tools is related to the reduced flexibility of existing modeling platforms that do not permit to relax or enforce their rigidity depending on the stages of the applied development process. For instance, EMF does not permit to enter models which are not conforming to a metamodel. On one hand this allows only valid models to be defined, but on the other, it makes the corresponding pragmatics more difficult. Thus there is an increasing need for techniques supporting flexibility in a wide range of modeling activities, including metamodel, model, and model transformation development and reuse. The workshop aims at identifying the difficulties in the current practice of MDE related to the lack of flexibility, and soliciting contributions of ideas, concepts, and techniques also from other areas of software development which could be useful to revise certain MDE fundamental typing concepts, to facilitate flexible reuse of MDE artefacts, and to define agile model sketching techniques.",
							url : "http://www.di.univaq.it/flexmde/",
							organizers : [
								{
									name : "Davide Di Ruscio",
									email : "davide.diruscio@univaq.it"
								},
								{
									name : "Alfonso Pierantonio",
									email : "alfonso.pierantonio@univaq.it"
								},
								{
									name : "Juan De Lara",
									email : "Juan.deLara@uam.es"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161002T140000Z",
					icalEnd : "20161002T153000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "VOLT",
							abstract : "Model transformations are everywhere in software development, implicitly or explicitly. They have been described as “the heart and soul of Model-Driven Development (MDD)”. Several experts have identified the verification of model transformations as one of the grand challenges of MDD. Despite some recent activity in the field, the work on the verification of model transformations remains scattered and a clear perspective on the subject is still not in sight. Furthermore, current model transformation tools most often lack verification techniques to support such activities. The Fifth International Workshop on the Verification Of modeL Transformation is one of the most accurate venues to offer researchers a dedicated forum to classify, discuss, propose, and advance verification techniques dedicated to model transformations. VOLT promotes discussions between theoreticians and practitioners from academy and industry, given its ideal co-location with MODELS. VOLT’s interest spans both to academic and industrial practices. One of the goals of the forum is to collect enough industrial case studies so that those problems can be stated at a theoretical level.",
							url : "http://www-ens.iro.umontreal.ca/~syriani/volt2016/",
							organizers : [
								{
									name : "Moussa Amrani",
									email : "moussa.amrani@unamur.be"
								},
								{
									name : "Eugene Syriani",
									email : "syriani@iro.umontreal.ca"
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
		name : "Monday",
		date : "20161003",
		rooms : [
			{
				name : "Rotonde Surcouf"
			},
			{
				name : "Rotonde J. Cartier"
			},
			{
				name : "Bouvet 1",
				capacity : "45"
			},
			{
				name : "Bouvet 2",
				capacity : "45"
			},
			{
				name : "Charcot",
				capacity : "54"
			},
			{
				name : "Vauban 1",
				capacity : "50"
			},
			{
				name : "Vauban 2",
				capacity : "60"
			},
			{
				name : "Lamennais 1",
				capacity : "80"
			},
			{
				name : "Lamennais 2",
				capacity : "80"
			},
			{
				name : "Lamennais 3",
				capacity : "80"
			}
		],
		sessionGroups : [
			[
				{
					start : "09:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161003T070000Z",
					icalEnd : "20161003T083000Z",
					room : "Bouvet 1",
					events : [
						{
							type : "Tutorial",
							title : "Empirical Research in Model Based Software Engineering",
							organizers : [
								{
									name : "Michel Chaudron"
								},
								{
									name : "Regina Hebig"
								},
								{
									name : "Maria Teresa Baldassarre"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161003T070000Z",
					icalEnd : "20161003T083000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Tutorial",
							title : "Applying Model Driven Engineering Technologies in the Creation of Domain Specific Modeling Languages",
							organizers : [
								{
									name : "Bruce Trask"
								},
								{
									name : "Angel Roman"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161003T070000Z",
					icalEnd : "20161003T083000Z",
					room : "Charcot",
					events : [
						{
							type : "Workshop",
							title : "PAME",
							abstract : "PAME is intended to be the first forum for practitioners in MDE to discuss patterns that occur often during the different modeling activities. The aim of this workshop is to provide an arena for proposing and discussing good practices, patterns, pattern-based modeling, as well as start the initiative of developing a “language” for discussing and describing relevant problems and their solutions in the form of patterns.",
							url : "http://www-ens.iro.umontreal.ca/~syriani/pame2016",
							organizers : [
								{
									name : "Eugene Syriani",
									email : "syriani@iro.umontreal.ca"
								},
								{
									name : "Richard Paige",
									email : "richard.paige@york.ac.uk"
								},
								{
									name : "Steffen Zschaler",
									email : "steffen.zschaler@kcl.ac.uk"
								},
								{
									name : "Huseyin Ergin",
									email : "hergin@crimson.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161003T070000Z",
					icalEnd : "20161003T083000Z",
					room : "Vauban 1",
					events : [
						{
							type : "EducatorSymposium",
							title : "Educator Symposium",
							organizers : [
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161003T070000Z",
					icalEnd : "20161003T083000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "OSS4MDE",
							abstract : "Just like the previous versions of the workshop, OSS4MDE’16 workshop will bring together researchers, educators and industry representatives interested in modeling and MDE with open source tools. However, compared to previous incarnations, OSS4MDE’16 will be less formal and more interactive, and place more emphasis on promoting open source by inspiring and encouraging potential users and contributors, and supporting existing users and contributors.",
							url : "http://www.cs.queensu.ca/oss4mde",
							organizers : [
								{
									name : "Juergen Dingel",
									email : "dingel@cs.queensu.ca"
								},
								{
									name : "Francis Bordeleau",
									email : "francis.bordeleau@ericsson.com"
								},
								{
									name : "Jean-Michel Bruel",
									email : "bruel@irit.fr"
								},
								{
									name : "Sebastien Gerard",
									email : "sebastien.gerard@cea.fr"
								},
								{
									name : "Sebastian Voss",
									email : "voss@fortiss.org"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161003T070000Z",
					icalEnd : "20161003T083000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "EXE",
							abstract : "Executable models have the potential of bringing major benefits to the development of complex systems, as they provide abstractions of complex system behaviors and allow for the performance of early analyses of that behavior. Despite the potential benefits of executable models, there are still many challenges to solve, such as the lack of maturity in the definition of and tooling for executable modeling languages, and the limited experience with executable modeling in much of the software development industry. The objective of this workshop is to draw attention to the potentials and challenges of executable modeling and advance the state-of-the-art in executable modeling. We aim at bringing together researchers working towards overcoming challenges in executable modeling, as well as practitioners from different application domains and application contexts of executable modeling. The workshop intends to provide a forum for exchanging recent results, ideas, opinions, requirements, and experiences in executable modeling.",
							url : "http://www.modelexecution.org/",
							organizers : [
								{
									name : "Tanja Mayerhofer",
									email : "mayerhofer@big.tuwien.ac.at"
								},
								{
									name : "Philip Langer",
									email : "planger@eclipsesource.com"
								},
								{
									name : "Ed Seidewitz",
									email : "ed-s@modeldriven.com"
								},
								{
									name : "Jeff Gray",
									email : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161003T070000Z",
					icalEnd : "20161003T083000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "MoDeVVa",
							abstract : "MoDeVVa offers a forum for researchers and practitioners who are working on Verification & Validation and Models-driven Engineering. The major questions of interest in MoDeVVa concern the mutual benefits of MDE and V&V: How can models-driven engineering improve V&V?, and How can V&V leverage the techniques around models-driven engineering? In 2016 we put an emphasis on making the V&V activities of MDE artefacts a systematic process. This includes modeling the V&V activities, investigating the synergies between them or composing different V&V activities to increase the confidence in the verification results.",
							url : "https://sites.google.com/site/modevva/",
							organizers : [
								{
									name : "Michalis Famelis",
									email : "famelis@cs.ubc.ca"
								},
								{
									name : "Daniel Ratiu",
									email : "daniel.ratiu@siemens.com"
								},
								{
									name : "Gehan M. K. Selim",
									email : "gehan@cs.queensu.ca"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161003T070000Z",
					icalEnd : "20161003T083000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "SAM",
							organizers : [
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
					start : "10:30",
					rowSpan : 2
				},
				{
					start : "10:30",
					end : "11:00",
					rowSpan : 2,
					icalStart : "20161003T083000Z",
					icalEnd : "20161003T090000Z",
					room : "Rotonde Surcouf",
					events : [
						{
							type : "SRC",
							title : "SRC Poster"
						},
						{
							type : "Clinic",
							title : "Clinic"
						}
					]
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				}
			],
			[],
			[
				{
					start : "11:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161003T090000Z",
					icalEnd : "20161003T103000Z",
					room : "Bouvet 1",
					events : [
						{
							type : "Tutorial",
							title : "Empirical Research in Model Based Software Engineering",
							organizers : [
								{
									name : "Michel Chaudron"
								},
								{
									name : "Regina Hebig"
								},
								{
									name : "Maria Teresa Baldassarre"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161003T090000Z",
					icalEnd : "20161003T103000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Tutorial",
							title : "Applying Model Driven Engineering Technologies in the Creation of Domain Specific Modeling Languages",
							organizers : [
								{
									name : "Bruce Trask"
								},
								{
									name : "Angel Roman"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161003T090000Z",
					icalEnd : "20161003T103000Z",
					room : "Charcot",
					events : [
						{
							type : "Workshop",
							title : "PAME",
							abstract : "PAME is intended to be the first forum for practitioners in MDE to discuss patterns that occur often during the different modeling activities. The aim of this workshop is to provide an arena for proposing and discussing good practices, patterns, pattern-based modeling, as well as start the initiative of developing a “language” for discussing and describing relevant problems and their solutions in the form of patterns.",
							url : "http://www-ens.iro.umontreal.ca/~syriani/pame2016",
							organizers : [
								{
									name : "Eugene Syriani",
									email : "syriani@iro.umontreal.ca"
								},
								{
									name : "Richard Paige",
									email : "richard.paige@york.ac.uk"
								},
								{
									name : "Steffen Zschaler",
									email : "steffen.zschaler@kcl.ac.uk"
								},
								{
									name : "Huseyin Ergin",
									email : "hergin@crimson.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161003T090000Z",
					icalEnd : "20161003T103000Z",
					room : "Vauban 1",
					events : [
						{
							type : "EducatorSymposium",
							title : "Educator Symposium",
							organizers : [
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161003T090000Z",
					icalEnd : "20161003T103000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "OSS4MDE",
							abstract : "Just like the previous versions of the workshop, OSS4MDE’16 workshop will bring together researchers, educators and industry representatives interested in modeling and MDE with open source tools. However, compared to previous incarnations, OSS4MDE’16 will be less formal and more interactive, and place more emphasis on promoting open source by inspiring and encouraging potential users and contributors, and supporting existing users and contributors.",
							url : "http://www.cs.queensu.ca/oss4mde",
							organizers : [
								{
									name : "Juergen Dingel",
									email : "dingel@cs.queensu.ca"
								},
								{
									name : "Francis Bordeleau",
									email : "francis.bordeleau@ericsson.com"
								},
								{
									name : "Jean-Michel Bruel",
									email : "bruel@irit.fr"
								},
								{
									name : "Sebastien Gerard",
									email : "sebastien.gerard@cea.fr"
								},
								{
									name : "Sebastian Voss",
									email : "voss@fortiss.org"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161003T090000Z",
					icalEnd : "20161003T103000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "EXE",
							abstract : "Executable models have the potential of bringing major benefits to the development of complex systems, as they provide abstractions of complex system behaviors and allow for the performance of early analyses of that behavior. Despite the potential benefits of executable models, there are still many challenges to solve, such as the lack of maturity in the definition of and tooling for executable modeling languages, and the limited experience with executable modeling in much of the software development industry. The objective of this workshop is to draw attention to the potentials and challenges of executable modeling and advance the state-of-the-art in executable modeling. We aim at bringing together researchers working towards overcoming challenges in executable modeling, as well as practitioners from different application domains and application contexts of executable modeling. The workshop intends to provide a forum for exchanging recent results, ideas, opinions, requirements, and experiences in executable modeling.",
							url : "http://www.modelexecution.org/",
							organizers : [
								{
									name : "Tanja Mayerhofer",
									email : "mayerhofer@big.tuwien.ac.at"
								},
								{
									name : "Philip Langer",
									email : "planger@eclipsesource.com"
								},
								{
									name : "Ed Seidewitz",
									email : "ed-s@modeldriven.com"
								},
								{
									name : "Jeff Gray",
									email : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161003T090000Z",
					icalEnd : "20161003T103000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "MoDeVVa",
							abstract : "MoDeVVa offers a forum for researchers and practitioners who are working on Verification & Validation and Models-driven Engineering. The major questions of interest in MoDeVVa concern the mutual benefits of MDE and V&V: How can models-driven engineering improve V&V?, and How can V&V leverage the techniques around models-driven engineering? In 2016 we put an emphasis on making the V&V activities of MDE artefacts a systematic process. This includes modeling the V&V activities, investigating the synergies between them or composing different V&V activities to increase the confidence in the verification results.",
							url : "https://sites.google.com/site/modevva/",
							organizers : [
								{
									name : "Michalis Famelis",
									email : "famelis@cs.ubc.ca"
								},
								{
									name : "Daniel Ratiu",
									email : "daniel.ratiu@siemens.com"
								},
								{
									name : "Gehan M. K. Selim",
									email : "gehan@cs.queensu.ca"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161003T090000Z",
					icalEnd : "20161003T103000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "SAM",
							organizers : [
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
					start : "12:30",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "12:30",
					end : "14:00",
					rowSpan : 6,
					icalStart : "20161003T103000Z",
					icalEnd : "20161003T120000Z",
					room : "Rotonde J. Cartier",
					events : [
						{
							type : "Lunch",
							title : "Lunch"
						}
					]
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					start : "14:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161003T120000Z",
					icalEnd : "20161003T133000Z",
					room : "Bouvet 1",
					events : [
						{
							type : "Tutorial",
							title : "Empirical Research in Model Based Software Engineering",
							organizers : [
								{
									name : "Michel Chaudron"
								},
								{
									name : "Regina Hebig"
								},
								{
									name : "Maria Teresa Baldassarre"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161003T120000Z",
					icalEnd : "20161003T133000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Tutorial",
							title : "Multi-level Modelling with MetaDepth",
							organizers : [
								{
									name : "Juan De Lara"
								},
								{
									name : "Esther Guerra"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161003T120000Z",
					icalEnd : "20161003T133000Z",
					room : "Charcot",
					events : [
						{
							type : "Workshop",
							title : "PAME",
							abstract : "PAME is intended to be the first forum for practitioners in MDE to discuss patterns that occur often during the different modeling activities. The aim of this workshop is to provide an arena for proposing and discussing good practices, patterns, pattern-based modeling, as well as start the initiative of developing a “language” for discussing and describing relevant problems and their solutions in the form of patterns.",
							url : "http://www-ens.iro.umontreal.ca/~syriani/pame2016",
							organizers : [
								{
									name : "Eugene Syriani",
									email : "syriani@iro.umontreal.ca"
								},
								{
									name : "Richard Paige",
									email : "richard.paige@york.ac.uk"
								},
								{
									name : "Steffen Zschaler",
									email : "steffen.zschaler@kcl.ac.uk"
								},
								{
									name : "Huseyin Ergin",
									email : "hergin@crimson.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161003T120000Z",
					icalEnd : "20161003T133000Z",
					room : "Vauban 1",
					events : [
						{
							type : "EducatorSymposium",
							title : "Educator Symposium",
							organizers : [
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161003T120000Z",
					icalEnd : "20161003T133000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "OSS4MDE",
							abstract : "Just like the previous versions of the workshop, OSS4MDE’16 workshop will bring together researchers, educators and industry representatives interested in modeling and MDE with open source tools. However, compared to previous incarnations, OSS4MDE’16 will be less formal and more interactive, and place more emphasis on promoting open source by inspiring and encouraging potential users and contributors, and supporting existing users and contributors.",
							url : "http://www.cs.queensu.ca/oss4mde",
							organizers : [
								{
									name : "Juergen Dingel",
									email : "dingel@cs.queensu.ca"
								},
								{
									name : "Francis Bordeleau",
									email : "francis.bordeleau@ericsson.com"
								},
								{
									name : "Jean-Michel Bruel",
									email : "bruel@irit.fr"
								},
								{
									name : "Sebastien Gerard",
									email : "sebastien.gerard@cea.fr"
								},
								{
									name : "Sebastian Voss",
									email : "voss@fortiss.org"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161003T120000Z",
					icalEnd : "20161003T133000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "EXE",
							abstract : "Executable models have the potential of bringing major benefits to the development of complex systems, as they provide abstractions of complex system behaviors and allow for the performance of early analyses of that behavior. Despite the potential benefits of executable models, there are still many challenges to solve, such as the lack of maturity in the definition of and tooling for executable modeling languages, and the limited experience with executable modeling in much of the software development industry. The objective of this workshop is to draw attention to the potentials and challenges of executable modeling and advance the state-of-the-art in executable modeling. We aim at bringing together researchers working towards overcoming challenges in executable modeling, as well as practitioners from different application domains and application contexts of executable modeling. The workshop intends to provide a forum for exchanging recent results, ideas, opinions, requirements, and experiences in executable modeling.",
							url : "http://www.modelexecution.org/",
							organizers : [
								{
									name : "Tanja Mayerhofer",
									email : "mayerhofer@big.tuwien.ac.at"
								},
								{
									name : "Philip Langer",
									email : "planger@eclipsesource.com"
								},
								{
									name : "Ed Seidewitz",
									email : "ed-s@modeldriven.com"
								},
								{
									name : "Jeff Gray",
									email : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161003T120000Z",
					icalEnd : "20161003T133000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "MoDeVVa",
							abstract : "MoDeVVa offers a forum for researchers and practitioners who are working on Verification & Validation and Models-driven Engineering. The major questions of interest in MoDeVVa concern the mutual benefits of MDE and V&V: How can models-driven engineering improve V&V?, and How can V&V leverage the techniques around models-driven engineering? In 2016 we put an emphasis on making the V&V activities of MDE artefacts a systematic process. This includes modeling the V&V activities, investigating the synergies between them or composing different V&V activities to increase the confidence in the verification results.",
							url : "https://sites.google.com/site/modevva/",
							organizers : [
								{
									name : "Michalis Famelis",
									email : "famelis@cs.ubc.ca"
								},
								{
									name : "Daniel Ratiu",
									email : "daniel.ratiu@siemens.com"
								},
								{
									name : "Gehan M. K. Selim",
									email : "gehan@cs.queensu.ca"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161003T120000Z",
					icalEnd : "20161003T133000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "SAM",
							organizers : [
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
					start : "15:30",
					rowSpan : 2
				},
				{
					start : "15:30",
					end : "16:00",
					rowSpan : 2,
					icalStart : "20161003T133000Z",
					icalEnd : "20161003T140000Z",
					room : "Rotonde Surcouf",
					events : [
						{
							type : "SRC",
							title : "SRC Poster"
						},
						{
							type : "Clinic",
							title : "Clinic"
						}
					]
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				}
			],
			[],
			[
				{
					start : "16:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161003T140000Z",
					icalEnd : "20161003T153000Z",
					room : "Bouvet 1",
					events : [
						{
							type : "Tutorial",
							title : "Empirical Research in Model Based Software Engineering",
							organizers : [
								{
									name : "Michel Chaudron"
								},
								{
									name : "Regina Hebig"
								},
								{
									name : "Maria Teresa Baldassarre"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161003T140000Z",
					icalEnd : "20161003T153000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Tutorial",
							title : "Multi-level Modelling with MetaDepth",
							organizers : [
								{
									name : "Juan De Lara"
								},
								{
									name : "Esther Guerra"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161003T140000Z",
					icalEnd : "20161003T153000Z",
					room : "Charcot",
					events : [
						{
							type : "Workshop",
							title : "PAME",
							abstract : "PAME is intended to be the first forum for practitioners in MDE to discuss patterns that occur often during the different modeling activities. The aim of this workshop is to provide an arena for proposing and discussing good practices, patterns, pattern-based modeling, as well as start the initiative of developing a “language” for discussing and describing relevant problems and their solutions in the form of patterns.",
							url : "http://www-ens.iro.umontreal.ca/~syriani/pame2016",
							organizers : [
								{
									name : "Eugene Syriani",
									email : "syriani@iro.umontreal.ca"
								},
								{
									name : "Richard Paige",
									email : "richard.paige@york.ac.uk"
								},
								{
									name : "Steffen Zschaler",
									email : "steffen.zschaler@kcl.ac.uk"
								},
								{
									name : "Huseyin Ergin",
									email : "hergin@crimson.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161003T140000Z",
					icalEnd : "20161003T153000Z",
					room : "Vauban 1",
					events : [
						{
							type : "EducatorSymposium",
							title : "Educator Symposium",
							organizers : [
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161003T140000Z",
					icalEnd : "20161003T153000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "OSS4MDE",
							abstract : "Just like the previous versions of the workshop, OSS4MDE’16 workshop will bring together researchers, educators and industry representatives interested in modeling and MDE with open source tools. However, compared to previous incarnations, OSS4MDE’16 will be less formal and more interactive, and place more emphasis on promoting open source by inspiring and encouraging potential users and contributors, and supporting existing users and contributors.",
							url : "http://www.cs.queensu.ca/oss4mde",
							organizers : [
								{
									name : "Juergen Dingel",
									email : "dingel@cs.queensu.ca"
								},
								{
									name : "Francis Bordeleau",
									email : "francis.bordeleau@ericsson.com"
								},
								{
									name : "Jean-Michel Bruel",
									email : "bruel@irit.fr"
								},
								{
									name : "Sebastien Gerard",
									email : "sebastien.gerard@cea.fr"
								},
								{
									name : "Sebastian Voss",
									email : "voss@fortiss.org"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161003T140000Z",
					icalEnd : "20161003T153000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "EXE",
							abstract : "Executable models have the potential of bringing major benefits to the development of complex systems, as they provide abstractions of complex system behaviors and allow for the performance of early analyses of that behavior. Despite the potential benefits of executable models, there are still many challenges to solve, such as the lack of maturity in the definition of and tooling for executable modeling languages, and the limited experience with executable modeling in much of the software development industry. The objective of this workshop is to draw attention to the potentials and challenges of executable modeling and advance the state-of-the-art in executable modeling. We aim at bringing together researchers working towards overcoming challenges in executable modeling, as well as practitioners from different application domains and application contexts of executable modeling. The workshop intends to provide a forum for exchanging recent results, ideas, opinions, requirements, and experiences in executable modeling.",
							url : "http://www.modelexecution.org/",
							organizers : [
								{
									name : "Tanja Mayerhofer",
									email : "mayerhofer@big.tuwien.ac.at"
								},
								{
									name : "Philip Langer",
									email : "planger@eclipsesource.com"
								},
								{
									name : "Ed Seidewitz",
									email : "ed-s@modeldriven.com"
								},
								{
									name : "Jeff Gray",
									email : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161003T140000Z",
					icalEnd : "20161003T153000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "MoDeVVa",
							abstract : "MoDeVVa offers a forum for researchers and practitioners who are working on Verification & Validation and Models-driven Engineering. The major questions of interest in MoDeVVa concern the mutual benefits of MDE and V&V: How can models-driven engineering improve V&V?, and How can V&V leverage the techniques around models-driven engineering? In 2016 we put an emphasis on making the V&V activities of MDE artefacts a systematic process. This includes modeling the V&V activities, investigating the synergies between them or composing different V&V activities to increase the confidence in the verification results.",
							url : "https://sites.google.com/site/modevva/",
							organizers : [
								{
									name : "Michalis Famelis",
									email : "famelis@cs.ubc.ca"
								},
								{
									name : "Daniel Ratiu",
									email : "daniel.ratiu@siemens.com"
								},
								{
									name : "Gehan M. K. Selim",
									email : "gehan@cs.queensu.ca"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161003T140000Z",
					icalEnd : "20161003T153000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "SAM",
							organizers : [
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
					start : "17:30",
					rowSpan : 10
				},
				{
					rowSpan : 10
				},
				{
					rowSpan : 10
				},
				{
					rowSpan : 10
				},
				{
					rowSpan : 10
				},
				{
					rowSpan : 10
				},
				{
					rowSpan : 10
				},
				{
					rowSpan : 10
				},
				{
					rowSpan : 10
				},
				{
					rowSpan : 10
				},
				{
					rowSpan : 10
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
			[
				{
					start : "20:00",
					rowSpan : 8
				},
				{
					start : "20:00",
					end : "22:00",
					rowSpan : 8,
					icalStart : "20161003T180000Z",
					icalEnd : "20161003T200000Z",
					room : "Rotonde Surcouf",
					events : [
						{
							type : "SRC",
							title : "SRC Poster"
						}
					]
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				}
			],
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
		name : "Tuesday",
		date : "20161004",
		rooms : [
			{
				name : "Rotonde Surcouf"
			},
			{
				name : "Rotonde J. Cartier"
			},
			{
				name : "Bouvet 1",
				capacity : "45"
			},
			{
				name : "Bouvet 2",
				capacity : "45"
			},
			{
				name : "Charcot",
				capacity : "54"
			},
			{
				name : "Vauban 1",
				capacity : "50"
			},
			{
				name : "Vauban 2",
				capacity : "60"
			},
			{
				name : "Lamennais 1",
				capacity : "80"
			},
			{
				name : "Lamennais 2",
				capacity : "80"
			},
			{
				name : "Lamennais 3",
				capacity : "80"
			}
		],
		sessionGroups : [
			[
				{
					start : "09:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161004T070000Z",
					icalEnd : "20161004T083000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Workshop",
							title : "ModComp",
							abstract : "Model-Driven Engineering (MDE) and Component-Based Software Engineering (CBSE) have been proven to effectively reduce software development complexity by (i) shifting the focus from source code to models and (ii) breaking down the set of desired features and their intricacy into smaller sub-modules, respectively. Moreover, the interplay of MDE and CBSE approaches is gaining recognition as a very promising means to boost the development of software systems by reducing costs and risks and shorten time-to-market. While several attempts to effectively combine MDE and CBSE have been documented, there are still unsolved clashes raising when exploiting interplay of MDE and CBSE, mostly due to mismatches in the related terminology as well as to differences in their basic essence.\nAs satellite event of MoDELS, the goal of ModComp’16 is to gather researchers and practitioners to share opinions, propose solutions to open challenges and generally explore the frontiers of interweaving between MDE and CBSE.",
							url : "http://www.mrtc.mdh.se/ModComp16/",
							organizers : [
								{
									name : "Federico Ciccozzi",
									email : "federico.ciccozzi@mdh.se"
								},
								{
									name : "Ivano Malavolta",
									email : "ivano.malavolta@gssi.infn.it"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161004T070000Z",
					icalEnd : "20161004T083000Z",
					room : "Charcot",
					events : [
						{
							type : "Workshop",
							title : "COMMitMDE",
							abstract : "Nowadays, collaborative model-driven software engineering (MDSE) is gaining a growing interest in both academia and practice. Goal of COMMitMDE 2016 is to bring together researchers and practitioners in order to investigate together (i) the potential impact of collaborative software engineering methods and principles into MDE practices and (ii) how MDE methods and techniques can support collaborative software engineering activities. Also, COMMitMDE aims at assessing the state of the research and practice on collaborative MDE, creating new synergies between tool vendors, researchers, and practitioners.",
							url : "http://cs.gssi.infn.it/commitmde2016",
							organizers : [
								{
									name : "Henry Muccini",
									email : "henry.muccini@univaq.it"
								},
								{
									name : "Ivano Malavolta",
									email : "ivano.malavolta@gssi.infn.it"
								},
								{
									name : "Sébastien Gérard",
									email : "sebastien.gerard@cea.fr"
								},
								{
									name : "Dimitrios S. Kolovos",
									email : "dimitris.kolovos@york.ac.uk"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161004T070000Z",
					icalEnd : "20161004T083000Z",
					room : "Vauban 1",
					events : [
						{
							type : "Workshop",
							title : "HuFaMo",
							abstract : "Modeling is a genuinely human enterprise, so many of the questions related to modeling can only be answered by empirical studies of human factors. The HuFaMo workshop series is the premier venue for early stage empirical research involving human factors in modeling. Our goal is to improve the state of the science and professionalism in empirical research in the Model Based Engineering community. Typical examples of such questions might consider the usability of a certain approach such as a method or language, or the emotional states or personal judgements of modelers. We invite submissions regarding empirical studies of emotion, cognition, personality traits of modelers as well as studies about activities and communities of modelers, their culture and capabilities. Beyond conventional papers, we also seek to publish study designs, negative results, and, in fact, suggestions for actual studies to be carried out at the workshop.",
							url : "http://hufamo.compute.dtu.dk/",
							organizers : [
								{
									name : "Harald Störrle",
									email : "hsto@dtu.dk"
								},
								{
									name : "Michel Chaudron",
									email : "michel.chaudron@cse.gu.se"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161004T070000Z",
					icalEnd : "20161004T083000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "MRT",
							abstract : "The complexity of adapting software during runtime has spawned interest in how models can be used to validate, monitor and adapt runtime behaviour. The use of models during runtime extends the use of modeling techniques beyond the design and implementation phases. The goal of this workshop is to look at issues related to developing appropriate model-driven approaches to managing and monitoring the execution of systems. We aim to continue the discussion of research ideas and proposals from researchers who work in relevant areas such as MDE, software architectures, reflection, and autonomic and self-adaptive systems, and provide a “state-of-the-art” research assessment expressed in terms of challenges and achievements.",
							url : "http://st.inf.tu-dresden.de/MRT16/",
							organizers : [
								{
									name : "Sebastian Götz",
									email : "sebastian.goetz@acm.org"
								},
								{
									name : "Nelly Bencomo",
									email : "nelly@acm.org"
								},
								{
									name : "Gordon Blair",
									email : "gordon@comp.lancs.ac.uk"
								},
								{
									name : "Hui Song",
									email : "hui.song@sintef.no"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161004T070000Z",
					icalEnd : "20161004T083000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "MULTI",
							abstract : "As interest in multi-level modelling grows, and the range of multi-level modelling tools expands, there is growing interest in consolidating the key principles of the paradigm and clarifying the essential differences between heterogeneous approaches.  Although multi-level modelling has now been used successfully in a variety of industrial projects and standards initiatives, there is still no clear consensus on what the paradigm actually entails and how it should be applied. For example, there are different views on whether it is sound to combine instance facets and type facets into so-called clabjects, whether strict metamodeling is too restrictive, and what tool architectures provide the best framework for modelling with multiple classification levels. This lack of a foundational consensus is mirrored by the lack of a common focus in current multi-level tools. The goal of MULTI 2016 is to address these challenges and continue the community building established in the previous workshops. In particular, the goal is to encourage the community to delineate different approaches to multi-level modelling and define objective ways to evaluate their respective strengths/weaknesses.",
							url : "http://swt4.informatik.uni-mannheim.de/multi-2016/index.html",
							organizers : [
								{
									name : "Colin Atkinson",
									email : "atkinson@informatik.uni-mannheim.de"
								},
								{
									name : "Tony Clark",
									email : "t.clark@shu.ac.uk"
								},
								{
									name : "Georg Grossmann",
									email : "georg@cs.unisa.edu.au"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161004T070000Z",
					icalEnd : "20161004T083000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "GEMOC",
							abstract : "To cope with complexity, modern software-intensive systems are often split in different concerns to serve the needs of diverse stakeholders. These different concerns are often associated with specialized description languages and technologies, which are based on concern-specific problems and solution concepts. Software developers are thus faced with the challenging task of integrating the different languages and associated technologies used to produce software artifacts in the different concern spaces.\nThe proposed GEMOC 2016 will be a full-day workshop that brings together researchers and practitioners in the modeling languages community to discuss the challenges associated with integrating multiple, heterogeneous modeling languages. The languages of interest range from requirements, to design and runtime languages, and include both general-purpose and domain-specific languages. Challenges related to engineering composable languages, well-formed semantic composition of languages and reasoning about systems described using heterogeneous languages are of particular interest. Following the three previous editions, a major objective is to continue collaborations and to expand a community that is focused on solving the problems arising from the globalization of modeling languages; i.e., the use of multiple DSLs to support coordinated development of diverse aspects of a system.",
							url : "http://gemoc.org/gemoc2016/",
							organizers : [
								{
									name : "Julien Deantoni",
									email : "julien.deantoni@polytech.unice.fr"
								},
								{
									name : "Jeff Gray",
									email : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161004T070000Z",
					icalEnd : "20161004T083000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "SAM",
							organizers : [
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
					start : "10:30",
					rowSpan : 2
				},
				{
					start : "10:30",
					end : "11:00",
					rowSpan : 2,
					icalStart : "20161004T083000Z",
					icalEnd : "20161004T090000Z",
					room : "Rotonde Surcouf",
					events : [
						{
							type : "CoffeeBreak",
							title : "Coffee Break"
						}
					]
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				}
			],
			[],
			[
				{
					start : "11:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161004T090000Z",
					icalEnd : "20161004T103000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Workshop",
							title : "ModComp",
							abstract : "Model-Driven Engineering (MDE) and Component-Based Software Engineering (CBSE) have been proven to effectively reduce software development complexity by (i) shifting the focus from source code to models and (ii) breaking down the set of desired features and their intricacy into smaller sub-modules, respectively. Moreover, the interplay of MDE and CBSE approaches is gaining recognition as a very promising means to boost the development of software systems by reducing costs and risks and shorten time-to-market. While several attempts to effectively combine MDE and CBSE have been documented, there are still unsolved clashes raising when exploiting interplay of MDE and CBSE, mostly due to mismatches in the related terminology as well as to differences in their basic essence.\nAs satellite event of MoDELS, the goal of ModComp’16 is to gather researchers and practitioners to share opinions, propose solutions to open challenges and generally explore the frontiers of interweaving between MDE and CBSE.",
							url : "http://www.mrtc.mdh.se/ModComp16/",
							organizers : [
								{
									name : "Federico Ciccozzi",
									email : "federico.ciccozzi@mdh.se"
								},
								{
									name : "Ivano Malavolta",
									email : "ivano.malavolta@gssi.infn.it"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161004T090000Z",
					icalEnd : "20161004T103000Z",
					room : "Charcot",
					events : [
						{
							type : "Workshop",
							title : "COMMitMDE",
							abstract : "Nowadays, collaborative model-driven software engineering (MDSE) is gaining a growing interest in both academia and practice. Goal of COMMitMDE 2016 is to bring together researchers and practitioners in order to investigate together (i) the potential impact of collaborative software engineering methods and principles into MDE practices and (ii) how MDE methods and techniques can support collaborative software engineering activities. Also, COMMitMDE aims at assessing the state of the research and practice on collaborative MDE, creating new synergies between tool vendors, researchers, and practitioners.",
							url : "http://cs.gssi.infn.it/commitmde2016",
							organizers : [
								{
									name : "Henry Muccini",
									email : "henry.muccini@univaq.it"
								},
								{
									name : "Ivano Malavolta",
									email : "ivano.malavolta@gssi.infn.it"
								},
								{
									name : "Sébastien Gérard",
									email : "sebastien.gerard@cea.fr"
								},
								{
									name : "Dimitrios S. Kolovos",
									email : "dimitris.kolovos@york.ac.uk"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161004T090000Z",
					icalEnd : "20161004T103000Z",
					room : "Vauban 1",
					events : [
						{
							type : "Workshop",
							title : "HuFaMo",
							abstract : "Modeling is a genuinely human enterprise, so many of the questions related to modeling can only be answered by empirical studies of human factors. The HuFaMo workshop series is the premier venue for early stage empirical research involving human factors in modeling. Our goal is to improve the state of the science and professionalism in empirical research in the Model Based Engineering community. Typical examples of such questions might consider the usability of a certain approach such as a method or language, or the emotional states or personal judgements of modelers. We invite submissions regarding empirical studies of emotion, cognition, personality traits of modelers as well as studies about activities and communities of modelers, their culture and capabilities. Beyond conventional papers, we also seek to publish study designs, negative results, and, in fact, suggestions for actual studies to be carried out at the workshop.",
							url : "http://hufamo.compute.dtu.dk/",
							organizers : [
								{
									name : "Harald Störrle",
									email : "hsto@dtu.dk"
								},
								{
									name : "Michel Chaudron",
									email : "michel.chaudron@cse.gu.se"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161004T090000Z",
					icalEnd : "20161004T103000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "MRT",
							abstract : "The complexity of adapting software during runtime has spawned interest in how models can be used to validate, monitor and adapt runtime behaviour. The use of models during runtime extends the use of modeling techniques beyond the design and implementation phases. The goal of this workshop is to look at issues related to developing appropriate model-driven approaches to managing and monitoring the execution of systems. We aim to continue the discussion of research ideas and proposals from researchers who work in relevant areas such as MDE, software architectures, reflection, and autonomic and self-adaptive systems, and provide a “state-of-the-art” research assessment expressed in terms of challenges and achievements.",
							url : "http://st.inf.tu-dresden.de/MRT16/",
							organizers : [
								{
									name : "Sebastian Götz",
									email : "sebastian.goetz@acm.org"
								},
								{
									name : "Nelly Bencomo",
									email : "nelly@acm.org"
								},
								{
									name : "Gordon Blair",
									email : "gordon@comp.lancs.ac.uk"
								},
								{
									name : "Hui Song",
									email : "hui.song@sintef.no"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161004T090000Z",
					icalEnd : "20161004T103000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "MULTI",
							abstract : "As interest in multi-level modelling grows, and the range of multi-level modelling tools expands, there is growing interest in consolidating the key principles of the paradigm and clarifying the essential differences between heterogeneous approaches.  Although multi-level modelling has now been used successfully in a variety of industrial projects and standards initiatives, there is still no clear consensus on what the paradigm actually entails and how it should be applied. For example, there are different views on whether it is sound to combine instance facets and type facets into so-called clabjects, whether strict metamodeling is too restrictive, and what tool architectures provide the best framework for modelling with multiple classification levels. This lack of a foundational consensus is mirrored by the lack of a common focus in current multi-level tools. The goal of MULTI 2016 is to address these challenges and continue the community building established in the previous workshops. In particular, the goal is to encourage the community to delineate different approaches to multi-level modelling and define objective ways to evaluate their respective strengths/weaknesses.",
							url : "http://swt4.informatik.uni-mannheim.de/multi-2016/index.html",
							organizers : [
								{
									name : "Colin Atkinson",
									email : "atkinson@informatik.uni-mannheim.de"
								},
								{
									name : "Tony Clark",
									email : "t.clark@shu.ac.uk"
								},
								{
									name : "Georg Grossmann",
									email : "georg@cs.unisa.edu.au"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161004T090000Z",
					icalEnd : "20161004T103000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "GEMOC",
							abstract : "To cope with complexity, modern software-intensive systems are often split in different concerns to serve the needs of diverse stakeholders. These different concerns are often associated with specialized description languages and technologies, which are based on concern-specific problems and solution concepts. Software developers are thus faced with the challenging task of integrating the different languages and associated technologies used to produce software artifacts in the different concern spaces.\nThe proposed GEMOC 2016 will be a full-day workshop that brings together researchers and practitioners in the modeling languages community to discuss the challenges associated with integrating multiple, heterogeneous modeling languages. The languages of interest range from requirements, to design and runtime languages, and include both general-purpose and domain-specific languages. Challenges related to engineering composable languages, well-formed semantic composition of languages and reasoning about systems described using heterogeneous languages are of particular interest. Following the three previous editions, a major objective is to continue collaborations and to expand a community that is focused on solving the problems arising from the globalization of modeling languages; i.e., the use of multiple DSLs to support coordinated development of diverse aspects of a system.",
							url : "http://gemoc.org/gemoc2016/",
							organizers : [
								{
									name : "Julien Deantoni",
									email : "julien.deantoni@polytech.unice.fr"
								},
								{
									name : "Jeff Gray",
									email : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161004T090000Z",
					icalEnd : "20161004T103000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "SAM",
							organizers : [
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
					start : "12:30",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "12:30",
					end : "14:00",
					rowSpan : 6,
					icalStart : "20161004T103000Z",
					icalEnd : "20161004T120000Z",
					room : "Rotonde J. Cartier",
					events : [
						{
							type : "Lunch",
							title : "Lunch"
						}
					]
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					start : "14:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161004T120000Z",
					icalEnd : "20161004T133000Z",
					room : "Bouvet 1",
					events : [
						{
							type : "SRC",
							title : "SRC Talk"
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161004T120000Z",
					icalEnd : "20161004T133000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Workshop",
							title : "ModComp",
							abstract : "Model-Driven Engineering (MDE) and Component-Based Software Engineering (CBSE) have been proven to effectively reduce software development complexity by (i) shifting the focus from source code to models and (ii) breaking down the set of desired features and their intricacy into smaller sub-modules, respectively. Moreover, the interplay of MDE and CBSE approaches is gaining recognition as a very promising means to boost the development of software systems by reducing costs and risks and shorten time-to-market. While several attempts to effectively combine MDE and CBSE have been documented, there are still unsolved clashes raising when exploiting interplay of MDE and CBSE, mostly due to mismatches in the related terminology as well as to differences in their basic essence.\nAs satellite event of MoDELS, the goal of ModComp’16 is to gather researchers and practitioners to share opinions, propose solutions to open challenges and generally explore the frontiers of interweaving between MDE and CBSE.",
							url : "http://www.mrtc.mdh.se/ModComp16/",
							organizers : [
								{
									name : "Federico Ciccozzi",
									email : "federico.ciccozzi@mdh.se"
								},
								{
									name : "Ivano Malavolta",
									email : "ivano.malavolta@gssi.infn.it"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161004T120000Z",
					icalEnd : "20161004T133000Z",
					room : "Charcot",
					events : [
						{
							type : "Workshop",
							title : "COMMitMDE",
							abstract : "Nowadays, collaborative model-driven software engineering (MDSE) is gaining a growing interest in both academia and practice. Goal of COMMitMDE 2016 is to bring together researchers and practitioners in order to investigate together (i) the potential impact of collaborative software engineering methods and principles into MDE practices and (ii) how MDE methods and techniques can support collaborative software engineering activities. Also, COMMitMDE aims at assessing the state of the research and practice on collaborative MDE, creating new synergies between tool vendors, researchers, and practitioners.",
							url : "http://cs.gssi.infn.it/commitmde2016",
							organizers : [
								{
									name : "Henry Muccini",
									email : "henry.muccini@univaq.it"
								},
								{
									name : "Ivano Malavolta",
									email : "ivano.malavolta@gssi.infn.it"
								},
								{
									name : "Sébastien Gérard",
									email : "sebastien.gerard@cea.fr"
								},
								{
									name : "Dimitrios S. Kolovos",
									email : "dimitris.kolovos@york.ac.uk"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161004T120000Z",
					icalEnd : "20161004T133000Z",
					room : "Vauban 1",
					events : [
						{
							type : "Workshop",
							title : "HuFaMo",
							abstract : "Modeling is a genuinely human enterprise, so many of the questions related to modeling can only be answered by empirical studies of human factors. The HuFaMo workshop series is the premier venue for early stage empirical research involving human factors in modeling. Our goal is to improve the state of the science and professionalism in empirical research in the Model Based Engineering community. Typical examples of such questions might consider the usability of a certain approach such as a method or language, or the emotional states or personal judgements of modelers. We invite submissions regarding empirical studies of emotion, cognition, personality traits of modelers as well as studies about activities and communities of modelers, their culture and capabilities. Beyond conventional papers, we also seek to publish study designs, negative results, and, in fact, suggestions for actual studies to be carried out at the workshop.",
							url : "http://hufamo.compute.dtu.dk/",
							organizers : [
								{
									name : "Harald Störrle",
									email : "hsto@dtu.dk"
								},
								{
									name : "Michel Chaudron",
									email : "michel.chaudron@cse.gu.se"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161004T120000Z",
					icalEnd : "20161004T133000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "MRT",
							abstract : "The complexity of adapting software during runtime has spawned interest in how models can be used to validate, monitor and adapt runtime behaviour. The use of models during runtime extends the use of modeling techniques beyond the design and implementation phases. The goal of this workshop is to look at issues related to developing appropriate model-driven approaches to managing and monitoring the execution of systems. We aim to continue the discussion of research ideas and proposals from researchers who work in relevant areas such as MDE, software architectures, reflection, and autonomic and self-adaptive systems, and provide a “state-of-the-art” research assessment expressed in terms of challenges and achievements.",
							url : "http://st.inf.tu-dresden.de/MRT16/",
							organizers : [
								{
									name : "Sebastian Götz",
									email : "sebastian.goetz@acm.org"
								},
								{
									name : "Nelly Bencomo",
									email : "nelly@acm.org"
								},
								{
									name : "Gordon Blair",
									email : "gordon@comp.lancs.ac.uk"
								},
								{
									name : "Hui Song",
									email : "hui.song@sintef.no"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161004T120000Z",
					icalEnd : "20161004T133000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "MULTI",
							abstract : "As interest in multi-level modelling grows, and the range of multi-level modelling tools expands, there is growing interest in consolidating the key principles of the paradigm and clarifying the essential differences between heterogeneous approaches.  Although multi-level modelling has now been used successfully in a variety of industrial projects and standards initiatives, there is still no clear consensus on what the paradigm actually entails and how it should be applied. For example, there are different views on whether it is sound to combine instance facets and type facets into so-called clabjects, whether strict metamodeling is too restrictive, and what tool architectures provide the best framework for modelling with multiple classification levels. This lack of a foundational consensus is mirrored by the lack of a common focus in current multi-level tools. The goal of MULTI 2016 is to address these challenges and continue the community building established in the previous workshops. In particular, the goal is to encourage the community to delineate different approaches to multi-level modelling and define objective ways to evaluate their respective strengths/weaknesses.",
							url : "http://swt4.informatik.uni-mannheim.de/multi-2016/index.html",
							organizers : [
								{
									name : "Colin Atkinson",
									email : "atkinson@informatik.uni-mannheim.de"
								},
								{
									name : "Tony Clark",
									email : "t.clark@shu.ac.uk"
								},
								{
									name : "Georg Grossmann",
									email : "georg@cs.unisa.edu.au"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161004T120000Z",
					icalEnd : "20161004T133000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "GEMOC",
							abstract : "To cope with complexity, modern software-intensive systems are often split in different concerns to serve the needs of diverse stakeholders. These different concerns are often associated with specialized description languages and technologies, which are based on concern-specific problems and solution concepts. Software developers are thus faced with the challenging task of integrating the different languages and associated technologies used to produce software artifacts in the different concern spaces.\nThe proposed GEMOC 2016 will be a full-day workshop that brings together researchers and practitioners in the modeling languages community to discuss the challenges associated with integrating multiple, heterogeneous modeling languages. The languages of interest range from requirements, to design and runtime languages, and include both general-purpose and domain-specific languages. Challenges related to engineering composable languages, well-formed semantic composition of languages and reasoning about systems described using heterogeneous languages are of particular interest. Following the three previous editions, a major objective is to continue collaborations and to expand a community that is focused on solving the problems arising from the globalization of modeling languages; i.e., the use of multiple DSLs to support coordinated development of diverse aspects of a system.",
							url : "http://gemoc.org/gemoc2016/",
							organizers : [
								{
									name : "Julien Deantoni",
									email : "julien.deantoni@polytech.unice.fr"
								},
								{
									name : "Jeff Gray",
									email : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161004T120000Z",
					icalEnd : "20161004T133000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "SAM",
							organizers : [
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
					start : "15:30",
					rowSpan : 2
				},
				{
					start : "15:30",
					end : "16:00",
					rowSpan : 2,
					icalStart : "20161004T133000Z",
					icalEnd : "20161004T140000Z",
					room : "Rotonde Surcouf",
					events : [
						{
							type : "CoffeeBreak",
							title : "Coffee Break"
						}
					]
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				}
			],
			[],
			[
				{
					start : "16:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161004T140000Z",
					icalEnd : "20161004T153000Z",
					room : "Bouvet 1",
					events : [
						{
							type : "SRC",
							title : "SRC Talk"
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161004T140000Z",
					icalEnd : "20161004T153000Z",
					room : "Bouvet 2",
					events : [
						{
							type : "Workshop",
							title : "ModComp",
							abstract : "Model-Driven Engineering (MDE) and Component-Based Software Engineering (CBSE) have been proven to effectively reduce software development complexity by (i) shifting the focus from source code to models and (ii) breaking down the set of desired features and their intricacy into smaller sub-modules, respectively. Moreover, the interplay of MDE and CBSE approaches is gaining recognition as a very promising means to boost the development of software systems by reducing costs and risks and shorten time-to-market. While several attempts to effectively combine MDE and CBSE have been documented, there are still unsolved clashes raising when exploiting interplay of MDE and CBSE, mostly due to mismatches in the related terminology as well as to differences in their basic essence.\nAs satellite event of MoDELS, the goal of ModComp’16 is to gather researchers and practitioners to share opinions, propose solutions to open challenges and generally explore the frontiers of interweaving between MDE and CBSE.",
							url : "http://www.mrtc.mdh.se/ModComp16/",
							organizers : [
								{
									name : "Federico Ciccozzi",
									email : "federico.ciccozzi@mdh.se"
								},
								{
									name : "Ivano Malavolta",
									email : "ivano.malavolta@gssi.infn.it"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161004T140000Z",
					icalEnd : "20161004T153000Z",
					room : "Charcot",
					events : [
						{
							type : "Workshop",
							title : "COMMitMDE",
							abstract : "Nowadays, collaborative model-driven software engineering (MDSE) is gaining a growing interest in both academia and practice. Goal of COMMitMDE 2016 is to bring together researchers and practitioners in order to investigate together (i) the potential impact of collaborative software engineering methods and principles into MDE practices and (ii) how MDE methods and techniques can support collaborative software engineering activities. Also, COMMitMDE aims at assessing the state of the research and practice on collaborative MDE, creating new synergies between tool vendors, researchers, and practitioners.",
							url : "http://cs.gssi.infn.it/commitmde2016",
							organizers : [
								{
									name : "Henry Muccini",
									email : "henry.muccini@univaq.it"
								},
								{
									name : "Ivano Malavolta",
									email : "ivano.malavolta@gssi.infn.it"
								},
								{
									name : "Sébastien Gérard",
									email : "sebastien.gerard@cea.fr"
								},
								{
									name : "Dimitrios S. Kolovos",
									email : "dimitris.kolovos@york.ac.uk"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161004T140000Z",
					icalEnd : "20161004T153000Z",
					room : "Vauban 1",
					events : [
						{
							type : "Workshop",
							title : "HuFaMo",
							abstract : "Modeling is a genuinely human enterprise, so many of the questions related to modeling can only be answered by empirical studies of human factors. The HuFaMo workshop series is the premier venue for early stage empirical research involving human factors in modeling. Our goal is to improve the state of the science and professionalism in empirical research in the Model Based Engineering community. Typical examples of such questions might consider the usability of a certain approach such as a method or language, or the emotional states or personal judgements of modelers. We invite submissions regarding empirical studies of emotion, cognition, personality traits of modelers as well as studies about activities and communities of modelers, their culture and capabilities. Beyond conventional papers, we also seek to publish study designs, negative results, and, in fact, suggestions for actual studies to be carried out at the workshop.",
							url : "http://hufamo.compute.dtu.dk/",
							organizers : [
								{
									name : "Harald Störrle",
									email : "hsto@dtu.dk"
								},
								{
									name : "Michel Chaudron",
									email : "michel.chaudron@cse.gu.se"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161004T140000Z",
					icalEnd : "20161004T153000Z",
					room : "Vauban 2",
					events : [
						{
							type : "Workshop",
							title : "MRT",
							abstract : "The complexity of adapting software during runtime has spawned interest in how models can be used to validate, monitor and adapt runtime behaviour. The use of models during runtime extends the use of modeling techniques beyond the design and implementation phases. The goal of this workshop is to look at issues related to developing appropriate model-driven approaches to managing and monitoring the execution of systems. We aim to continue the discussion of research ideas and proposals from researchers who work in relevant areas such as MDE, software architectures, reflection, and autonomic and self-adaptive systems, and provide a “state-of-the-art” research assessment expressed in terms of challenges and achievements.",
							url : "http://st.inf.tu-dresden.de/MRT16/",
							organizers : [
								{
									name : "Sebastian Götz",
									email : "sebastian.goetz@acm.org"
								},
								{
									name : "Nelly Bencomo",
									email : "nelly@acm.org"
								},
								{
									name : "Gordon Blair",
									email : "gordon@comp.lancs.ac.uk"
								},
								{
									name : "Hui Song",
									email : "hui.song@sintef.no"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161004T140000Z",
					icalEnd : "20161004T153000Z",
					room : "Lamennais 1",
					events : [
						{
							type : "Workshop",
							title : "MULTI",
							abstract : "As interest in multi-level modelling grows, and the range of multi-level modelling tools expands, there is growing interest in consolidating the key principles of the paradigm and clarifying the essential differences between heterogeneous approaches.  Although multi-level modelling has now been used successfully in a variety of industrial projects and standards initiatives, there is still no clear consensus on what the paradigm actually entails and how it should be applied. For example, there are different views on whether it is sound to combine instance facets and type facets into so-called clabjects, whether strict metamodeling is too restrictive, and what tool architectures provide the best framework for modelling with multiple classification levels. This lack of a foundational consensus is mirrored by the lack of a common focus in current multi-level tools. The goal of MULTI 2016 is to address these challenges and continue the community building established in the previous workshops. In particular, the goal is to encourage the community to delineate different approaches to multi-level modelling and define objective ways to evaluate their respective strengths/weaknesses.",
							url : "http://swt4.informatik.uni-mannheim.de/multi-2016/index.html",
							organizers : [
								{
									name : "Colin Atkinson",
									email : "atkinson@informatik.uni-mannheim.de"
								},
								{
									name : "Tony Clark",
									email : "t.clark@shu.ac.uk"
								},
								{
									name : "Georg Grossmann",
									email : "georg@cs.unisa.edu.au"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161004T140000Z",
					icalEnd : "20161004T153000Z",
					room : "Lamennais 2",
					events : [
						{
							type : "Workshop",
							title : "GEMOC",
							abstract : "To cope with complexity, modern software-intensive systems are often split in different concerns to serve the needs of diverse stakeholders. These different concerns are often associated with specialized description languages and technologies, which are based on concern-specific problems and solution concepts. Software developers are thus faced with the challenging task of integrating the different languages and associated technologies used to produce software artifacts in the different concern spaces.\nThe proposed GEMOC 2016 will be a full-day workshop that brings together researchers and practitioners in the modeling languages community to discuss the challenges associated with integrating multiple, heterogeneous modeling languages. The languages of interest range from requirements, to design and runtime languages, and include both general-purpose and domain-specific languages. Challenges related to engineering composable languages, well-formed semantic composition of languages and reasoning about systems described using heterogeneous languages are of particular interest. Following the three previous editions, a major objective is to continue collaborations and to expand a community that is focused on solving the problems arising from the globalization of modeling languages; i.e., the use of multiple DSLs to support coordinated development of diverse aspects of a system.",
							url : "http://gemoc.org/gemoc2016/",
							organizers : [
								{
									name : "Julien Deantoni",
									email : "julien.deantoni@polytech.unice.fr"
								},
								{
									name : "Jeff Gray",
									email : "gray@cs.ua.edu"
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161004T140000Z",
					icalEnd : "20161004T153000Z",
					room : "Lamennais 3",
					events : [
						{
							type : "Workshop",
							title : "SAM",
							organizers : [
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
		name : "Wednesday",
		date : "20161005",
		rooms : [
			{
				name : "Rotonde Surcouf"
			},
			{
				name : "Rotonde J. Cartier"
			},
			{
				name : "Grand Large"
			},
			{
				name : "Chateaubriand",
				capacity : "400"
			},
			{
				name : "Lamennais 1+2",
				capacity : "180"
			},
			{
				name : "Lamennais 4+5",
				capacity : "150"
			}
		],
		sessionGroups : [
			[
				{
					start : "09:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161005T070000Z",
					icalEnd : "20161005T083000Z",
					room : "Chateaubriand",
					events : [
						{
							type : "Keynote",
							title : "Keynote 1"
						}
					]
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					start : "10:30",
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					start : "10:30",
					end : "11:00",
					rowSpan : 2,
					icalStart : "20161005T083000Z",
					icalEnd : "20161005T090000Z",
					room : "Rotonde J. Cartier",
					events : [
						{
							type : "Poster",
							title : "Poster"
						}
					]
				},
				{
					start : "10:30",
					end : "11:00",
					rowSpan : 2,
					icalStart : "20161005T083000Z",
					icalEnd : "20161005T090000Z",
					room : "Grand Large",
					events : [
						{
							type : "CoffeeBreak",
							title : "Coffee Break"
						}
					]
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				}
			],
			[],
			[
				{
					start : "11:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161005T090000Z",
					icalEnd : "20161005T103000Z",
					room : "Chateaubriand",
					events : [
						{
							type : "TalkSession",
							title : "Takimata sanctus est lorem ipsum dolor sit amet lorem",
							chair : "Et Lorem",
							papers : [
								{
									title : "Et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et justo",
									abstract : "Et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum Lorem ipsum dolor sit amet. Eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua. Vero eos et accusam et. Lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut. Diam voluptua at vero eos. Kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor. Diam voluptua at vero eos et accusam et justo duo dolores et ea rebum stet. Eirmod tempor invidunt ut labore. Vero eos et accusam et. Kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor.",
									start : "11:00",
									icalStart : "20161005T090000Z",
									icalEnd : "20161005T092500Z",
									authors : [
										{
											name : "Invidunt At"
										},
										{
											name : "Sed Sea"
										}
									]
								},
								{
									title : "Sadipscing elitr sed diam nonumy",
									abstract : "Stet clita kasd gubergren no sea Accusam et justo duo dolores. Sed diam voluptua at vero. Sed diam voluptua at vero eos et accusam et justo duo dolores et ea rebum. Invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos et. Amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt. Diam nonumy eirmod tempor invidunt. Amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna. At vero eos et accusam et justo duo dolores et ea.",
									start : "11:25",
									icalStart : "20161005T092500Z",
									icalEnd : "20161005T095000Z",
									authors : [
										{
											name : "Dolores Et"
										},
										{
											name : "Vero Et"
										},
										{
											name : "Sed Kasd"
										}
									]
								},
								{
									title : "Amet consetetur sadipscing elitr sed",
									abstract : "Sed diam voluptua at vero eos et accusam et justo duo dolores et ea rebum Labore et dolore magna aliquyam erat sed diam voluptua at vero. Et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor. Aliquyam erat sed diam voluptua. Elitr sed diam nonumy eirmod tempor invidunt ut labore et. Sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat. Diam nonumy eirmod tempor invidunt. Et ea rebum stet clita. Invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos et. Diam voluptua at vero eos et accusam et justo duo dolores et ea rebum stet.",
									start : "11:50",
									icalStart : "20161005T095000Z",
									icalEnd : "20161005T101500Z",
									authors : [
										{
											name : "Kasd Sanctus"
										},
										{
											name : "Gubergren Consetetur"
										},
										{
											name : "Invidunt Nonumy"
										},
										{
											name : "Et Eos"
										},
										{
											name : "Vero Et"
										},
										{
											name : "Ipsum Magna"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161005T090000Z",
					icalEnd : "20161005T103000Z",
					room : "Lamennais 1+2",
					events : [
						{
							type : "TalkSession",
							title : "Diam voluptua at vero eos et accusam et justo duo dolores et ea rebum stet",
							chair : "Consetetur Erat",
							papers : [
								{
									title : "Voluptua at vero eos et",
									abstract : "Ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor Dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum. Sed diam voluptua at vero eos et accusam et. Et accusam et justo duo dolores et ea rebum stet clita kasd gubergren no sea. Magna aliquyam erat sed diam voluptua at vero eos et accusam et justo duo dolores. No sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet. Amet consetetur sadipscing elitr sed. Voluptua at vero eos et accusam et justo duo dolores et ea rebum stet clita.",
									start : "11:00",
									icalStart : "20161005T090000Z",
									icalEnd : "20161005T092500Z",
									authors : [
										{
											name : "Aliquyam At"
										},
										{
											name : "Ipsum Invidunt"
										},
										{
											name : "Ipsum Magna"
										},
										{
											name : "Takimata Et"
										},
										{
											name : "Est Lorem"
										},
										{
											name : "Invidunt At"
										}
									]
								},
								{
									title : "No sea takimata sanctus est",
									abstract : "Magna aliquyam erat sed diam voluptua at vero eos et accusam et justo duo Eos et accusam et justo. Ipsum dolor sit amet consetetur sadipscing elitr sed diam. Sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam. Tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos. Kasd gubergren no sea takimata. Nonumy eirmod tempor invidunt ut. Kasd gubergren no sea takimata sanctus est lorem ipsum dolor.",
									start : "11:25",
									icalStart : "20161005T092500Z",
									icalEnd : "20161005T095000Z",
									authors : [
										{
											name : "Eos Et"
										},
										{
											name : "No Aliquyam"
										},
										{
											name : "Kasd Dolores"
										},
										{
											name : "Gubergren At"
										},
										{
											name : "Eirmod Consetetur"
										}
									]
								},
								{
									title : "Consetetur sadipscing elitr sed diam",
									abstract : "Dolores et ea rebum stet clita kasd Eirmod tempor invidunt ut labore et dolore magna. Elitr sed diam nonumy eirmod. Sit amet lorem ipsum dolor. Voluptua at vero eos et accusam et justo duo dolores et ea rebum stet clita. Duo dolores et ea rebum. Sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam. Voluptua at vero eos et. Sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat. No sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet. Diam voluptua at vero eos et accusam et justo duo dolores et ea. Sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor.",
									start : "11:50",
									icalStart : "20161005T095000Z",
									icalEnd : "20161005T101500Z",
									authors : [
										{
											name : "Ipsum Nonumy"
										},
										{
											name : "Vero Ea"
										},
										{
											name : "Kasd Sanctus"
										},
										{
											name : "Ipsum Invidunt"
										},
										{
											name : "Nonumy Dolore"
										},
										{
											name : "Ipsum Nonumy"
										},
										{
											name : "Clita Tempor"
										},
										{
											name : "Ipsum Magna"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161005T090000Z",
					icalEnd : "20161005T103000Z",
					room : "Lamennais 4+5",
					events : [
						{
							type : "TalkSession",
							title : "Lorem ipsum dolor sit amet lorem ipsum dolor sit",
							chair : "Eos Sed",
							papers : [
								{
									title : "No sea takimata sanctus est",
									abstract : "Magna aliquyam erat sed diam voluptua at vero eos et accusam et justo duo Eos et accusam et justo. Ipsum dolor sit amet consetetur sadipscing elitr sed diam. Sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam. Tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos. Kasd gubergren no sea takimata. Nonumy eirmod tempor invidunt ut. Kasd gubergren no sea takimata sanctus est lorem ipsum dolor.",
									start : "11:00",
									icalStart : "20161005T090000Z",
									icalEnd : "20161005T092500Z",
									authors : [
										{
											name : "Eos Et"
										},
										{
											name : "No Aliquyam"
										},
										{
											name : "Kasd Dolores"
										},
										{
											name : "Gubergren At"
										},
										{
											name : "Eirmod Consetetur"
										}
									]
								},
								{
									title : "Voluptua at vero eos et",
									abstract : "Ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor Dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum. Sed diam voluptua at vero eos et accusam et. Et accusam et justo duo dolores et ea rebum stet clita kasd gubergren no sea. Magna aliquyam erat sed diam voluptua at vero eos et accusam et justo duo dolores. No sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet. Amet consetetur sadipscing elitr sed. Voluptua at vero eos et accusam et justo duo dolores et ea rebum stet clita.",
									start : "11:25",
									icalStart : "20161005T092500Z",
									icalEnd : "20161005T095000Z",
									authors : [
										{
											name : "Aliquyam At"
										},
										{
											name : "Ipsum Invidunt"
										},
										{
											name : "Ipsum Magna"
										},
										{
											name : "Takimata Et"
										},
										{
											name : "Est Lorem"
										},
										{
											name : "Invidunt At"
										}
									]
								},
								{
									title : "Eirmod tempor invidunt ut labore et dolore magna aliquyam",
									abstract : "Sadipscing elitr sed diam nonumy eirmod tempor invidunt Est lorem ipsum dolor sit amet lorem ipsum. Consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et. Invidunt ut labore et dolore. At vero eos et accusam et justo duo dolores et ea rebum stet clita. Gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit. Vero eos et accusam et justo duo dolores et ea. Duo dolores et ea rebum stet clita kasd gubergren no sea.",
									start : "11:50",
									icalStart : "20161005T095000Z",
									icalEnd : "20161005T101500Z",
									authors : [
										{
											name : "Nonumy Ea"
										},
										{
											name : "Kasd Dolores"
										},
										{
											name : "Voluptua Voluptua"
										},
										{
											name : "Est Lorem"
										},
										{
											name : "Ipsum Magna"
										},
										{
											name : "Consetetur Ipsum"
										}
									]
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
					start : "12:30",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "12:30",
					end : "14:00",
					rowSpan : 6,
					icalStart : "20161005T103000Z",
					icalEnd : "20161005T120000Z",
					room : "Grand Large",
					events : [
						{
							type : "Lunch",
							title : "Lunch"
						}
					]
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					start : "14:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161005T120000Z",
					icalEnd : "20161005T133000Z",
					room : "Chateaubriand",
					events : [
						{
							type : "TalkSession",
							title : "Rebum stet clita kasd gubergren",
							chair : "Lorem Diam",
							papers : [
								{
									title : "Rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit",
									abstract : "Erat sed diam voluptua at vero eos et accusam et Elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed. Dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy. Voluptua at vero eos et accusam et justo duo dolores et ea rebum stet clita. Dolor sit amet lorem ipsum. Et ea rebum stet clita. Amet lorem ipsum dolor sit amet consetetur sadipscing. Elitr sed diam nonumy eirmod tempor invidunt ut. Amet consetetur sadipscing elitr sed. Invidunt ut labore et dolore.",
									start : "14:00",
									icalStart : "20161005T120000Z",
									icalEnd : "20161005T122500Z",
									authors : [
										{
											name : "Gubergren Consetetur"
										},
										{
											name : "Labore Sed"
										},
										{
											name : "Voluptua Voluptua"
										},
										{
											name : "Diam Et"
										},
										{
											name : "Ipsum Invidunt"
										},
										{
											name : "Ipsum Magna"
										},
										{
											name : "Ipsum Magna"
										}
									]
								},
								{
									title : "Ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit",
									abstract : "Lorem ipsum dolor sit amet consetetur sadipscing elitr Eos et accusam et justo. Stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem. Labore et dolore magna aliquyam erat sed diam voluptua at. Stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet. Labore et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et. Nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed. Lorem ipsum dolor sit amet. Ut labore et dolore magna aliquyam erat sed. Ut labore et dolore magna.",
									start : "14:25",
									icalStart : "20161005T122500Z",
									icalEnd : "20161005T125000Z",
									authors : [
										{
											name : "Magna Dolore"
										},
										{
											name : "Magna Labore"
										},
										{
											name : "Sit Sadipscing"
										},
										{
											name : "Eos Et"
										}
									]
								},
								{
									title : "Sanctus est lorem ipsum dolor sit amet lorem ipsum",
									abstract : "Voluptua at vero eos et accusam et justo duo dolores At vero eos et accusam et justo. Elitr sed diam nonumy eirmod tempor invidunt ut. Dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum. Consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore. Stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem. At vero eos et accusam et justo duo dolores et ea rebum stet clita kasd. Ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy.",
									start : "14:50",
									icalStart : "20161005T125000Z",
									icalEnd : "20161005T131500Z",
									authors : [
										{
											name : "At No"
										},
										{
											name : "Sea Amet"
										},
										{
											name : "Amet Sit"
										},
										{
											name : "Diam Et"
										},
										{
											name : "Nonumy Ea"
										},
										{
											name : "Est Et"
										},
										{
											name : "Dolores Justo"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161005T120000Z",
					icalEnd : "20161005T133000Z",
					room : "Lamennais 1+2",
					events : [
						{
							type : "TalkSession",
							title : "Takimata sanctus est lorem ipsum dolor",
							chair : "Vero Clita",
							papers : [
								{
									title : "Consetetur sadipscing elitr sed diam nonumy eirmod tempor",
									abstract : "Dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod Amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et. Rebum stet clita kasd gubergren no sea. Sanctus est lorem ipsum dolor sit amet lorem ipsum. Dolores et ea rebum stet clita kasd gubergren no sea. Sed diam voluptua at vero. Amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna. Duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus est. Lorem ipsum dolor sit amet. Gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit. Voluptua at vero eos et accusam et justo duo dolores et ea rebum stet clita. Magna aliquyam erat sed diam voluptua at vero eos et accusam et justo duo dolores.",
									start : "14:00",
									icalStart : "20161005T120000Z",
									icalEnd : "20161005T122500Z",
									authors : [
										{
											name : "Sed Consetetur"
										},
										{
											name : "At No"
										},
										{
											name : "Lorem No"
										},
										{
											name : "Tempor Ea"
										},
										{
											name : "Invidunt Nonumy"
										},
										{
											name : "Diam Diam"
										},
										{
											name : "Dolor Eirmod"
										}
									]
								},
								{
									title : "Duo dolores et ea rebum",
									abstract : "Invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos et Dolores et ea rebum stet. Diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua. Diam voluptua at vero eos et accusam et justo duo dolores et ea rebum stet. No sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet. Sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam. Eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero. Ipsum dolor sit amet lorem ipsum dolor sit. Dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et. Sanctus est lorem ipsum dolor.",
									start : "14:25",
									icalStart : "20161005T122500Z",
									icalEnd : "20161005T125000Z",
									authors : [
										{
											name : "Kasd Dolores"
										},
										{
											name : "Sed Consetetur"
										},
										{
											name : "Sadipscing Ipsum"
										},
										{
											name : "Magna Labore"
										}
									]
								},
								{
									title : "Sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore",
									abstract : "Diam nonumy eirmod tempor invidunt ut labore Erat sed diam voluptua at vero eos et accusam et justo duo. Est lorem ipsum dolor sit. Clita kasd gubergren no sea takimata sanctus est. Clita kasd gubergren no sea. Dolor sit amet lorem ipsum. No sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet. Sed diam voluptua at vero eos et accusam et justo. Justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus est. At vero eos et accusam.",
									start : "14:50",
									icalStart : "20161005T125000Z",
									icalEnd : "20161005T131500Z",
									authors : [
										{
											name : "Accusam Ipsum"
										},
										{
											name : "Amet Sit"
										},
										{
											name : "Voluptua Dolore"
										},
										{
											name : "Sed Sea"
										},
										{
											name : "Voluptua Voluptua"
										},
										{
											name : "Dolores Et"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161005T120000Z",
					icalEnd : "20161005T133000Z",
					room : "Lamennais 4+5",
					events : [
						{
							type : "TalkSession",
							title : "Erat sed diam voluptua at vero eos et accusam et justo duo dolores et ea",
							chair : "Stet Justo",
							papers : [
								{
									title : "Gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit",
									abstract : "Sit amet consetetur sadipscing elitr Tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at. Stet clita kasd gubergren no. Amet consetetur sadipscing elitr sed. Et ea rebum stet clita kasd gubergren no sea takimata sanctus est. Clita kasd gubergren no sea. Vero eos et accusam et justo duo dolores et ea rebum stet clita kasd gubergren. Sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et.",
									start : "14:00",
									icalStart : "20161005T120000Z",
									icalEnd : "20161005T122500Z",
									authors : [
										{
											name : "Accusam Ipsum"
										},
										{
											name : "Magna Dolore"
										},
										{
											name : "Accusam Ipsum"
										},
										{
											name : "Labore Sed"
										}
									]
								},
								{
									title : "Sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed",
									abstract : "Et accusam et justo duo Amet consetetur sadipscing elitr sed. Invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos et. Clita kasd gubergren no sea. Eirmod tempor invidunt ut labore. Ipsum dolor sit amet consetetur sadipscing elitr sed. Dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed. Et accusam et justo duo. Consetetur sadipscing elitr sed diam.",
									start : "14:25",
									icalStart : "20161005T122500Z",
									icalEnd : "20161005T125000Z",
									authors : [
										{
											name : "Labore Sed"
										},
										{
											name : "Et Eos"
										},
										{
											name : "Stet No"
										}
									]
								},
								{
									title : "Sadipscing elitr sed diam nonumy",
									abstract : "Stet clita kasd gubergren no sea Accusam et justo duo dolores. Sed diam voluptua at vero. Sed diam voluptua at vero eos et accusam et justo duo dolores et ea rebum. Invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos et. Amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt. Diam nonumy eirmod tempor invidunt. Amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna. At vero eos et accusam et justo duo dolores et ea.",
									start : "14:50",
									icalStart : "20161005T125000Z",
									icalEnd : "20161005T131500Z",
									authors : [
										{
											name : "Dolores Et"
										},
										{
											name : "Vero Et"
										},
										{
											name : "Sed Kasd"
										}
									]
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
					start : "15:30",
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					start : "15:30",
					end : "16:00",
					rowSpan : 2,
					icalStart : "20161005T133000Z",
					icalEnd : "20161005T140000Z",
					room : "Rotonde J. Cartier",
					events : [
						{
							type : "Poster",
							title : "Poster"
						}
					]
				},
				{
					start : "15:30",
					end : "16:00",
					rowSpan : 2,
					icalStart : "20161005T133000Z",
					icalEnd : "20161005T140000Z",
					room : "Grand Large",
					events : [
						{
							type : "CoffeeBreak",
							title : "Coffee Break"
						}
					]
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				}
			],
			[],
			[
				{
					start : "16:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161005T140000Z",
					icalEnd : "20161005T153000Z",
					room : "Chateaubriand",
					events : [
						{
							type : "TalkSession",
							title : "Takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing",
							chair : "Consetetur Erat",
							papers : [
								{
									title : "Ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore",
									abstract : "Sed diam voluptua at vero eos et accusam et justo duo dolores Ipsum dolor sit amet lorem ipsum dolor sit amet consetetur. Dolor sit amet consetetur sadipscing. Magna aliquyam erat sed diam. Aliquyam erat sed diam voluptua. Dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut. Sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut. Et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor. No sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum. Labore et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et.",
									start : "16:00",
									icalStart : "20161005T140000Z",
									icalEnd : "20161005T142500Z",
									authors : [
										{
											name : "Nonumy At"
										},
										{
											name : "Gubergren At"
										},
										{
											name : "Ea Diam"
										},
										{
											name : "Et Diam"
										},
										{
											name : "At Justo"
										},
										{
											name : "No Aliquyam"
										},
										{
											name : "Tempor Et"
										}
									]
								},
								{
									title : "Consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam",
									abstract : "Sadipscing elitr sed diam nonumy eirmod tempor invidunt Kasd gubergren no sea takimata sanctus est lorem ipsum. Kasd gubergren no sea takimata. Sed diam nonumy eirmod tempor invidunt ut labore. Voluptua at vero eos et. Dolore magna aliquyam erat sed. Nonumy eirmod tempor invidunt ut. Ipsum dolor sit amet lorem ipsum. Dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et.",
									start : "16:25",
									icalStart : "20161005T142500Z",
									icalEnd : "20161005T145000Z",
									authors : [
										{
											name : "Magna Takimata"
										},
										{
											name : "Lorem Lorem"
										}
									]
								},
								{
									title : "Ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy",
									abstract : "Vero eos et accusam et justo duo dolores et ea rebum stet clita kasd gubergren Sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam. Voluptua at vero eos et. Tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero. Et dolore magna aliquyam erat sed diam. Magna aliquyam erat sed diam voluptua at vero eos. Sit amet consetetur sadipscing elitr. Sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam. Et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et justo.",
									start : "16:50",
									icalStart : "20161005T145000Z",
									icalEnd : "20161005T151500Z",
									authors : [
										{
											name : "Lorem Lorem"
										},
										{
											name : "Takimata Et"
										},
										{
											name : "Dolores Justo"
										},
										{
											name : "Duo Nonumy"
										},
										{
											name : "Sadipscing Ipsum"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161005T140000Z",
					icalEnd : "20161005T153000Z",
					room : "Lamennais 1+2",
					events : [
						{
							type : "TalkSession",
							title : "Accusam et justo duo dolores et ea rebum stet clita kasd gubergren",
							chair : "Ipsum Magna",
							papers : [
								{
									title : "Diam nonumy eirmod tempor invidunt",
									abstract : "Lorem ipsum dolor sit amet lorem ipsum dolor Kasd gubergren no sea takimata. Voluptua at vero eos et accusam. Et dolore magna aliquyam erat sed diam voluptua at vero. Ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit. Sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur. Diam voluptua at vero eos. Consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam.",
									start : "16:00",
									icalStart : "20161005T140000Z",
									icalEnd : "20161005T142500Z",
									authors : [
										{
											name : "Sed Kasd"
										},
										{
											name : "Nonumy At"
										},
										{
											name : "Rebum Sadipscing"
										},
										{
											name : "Consetetur Erat"
										}
									]
								},
								{
									title : "Justo duo dolores et ea",
									abstract : "Sanctus est lorem ipsum dolor Erat sed diam voluptua at vero eos et accusam et justo duo dolores et ea. Ea rebum stet clita kasd gubergren no. Lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut. Sit amet lorem ipsum dolor sit amet. Gubergren no sea takimata sanctus. Sed diam voluptua at vero. Voluptua at vero eos et accusam et justo duo dolores et ea rebum stet clita. Duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus. Elitr sed diam nonumy eirmod. Elitr sed diam nonumy eirmod.",
									start : "16:25",
									icalStart : "20161005T142500Z",
									icalEnd : "20161005T145000Z",
									authors : [
										{
											name : "Stet Justo"
										},
										{
											name : "Eirmod Consetetur"
										},
										{
											name : "Ut Accusam"
										},
										{
											name : "Amet Sed"
										},
										{
											name : "Stet Est"
										},
										{
											name : "Ipsum Magna"
										},
										{
											name : "Ipsum Invidunt"
										},
										{
											name : "Accusam Ipsum"
										}
									]
								},
								{
									title : "Et justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus",
									abstract : "Eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed Voluptua at vero eos et. Aliquyam erat sed diam voluptua at vero eos et accusam et justo duo dolores et. Elitr sed diam nonumy eirmod tempor invidunt ut labore et. Diam nonumy eirmod tempor invidunt. Ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit. Et justo duo dolores et. Clita kasd gubergren no sea takimata sanctus. Erat sed diam voluptua at vero eos et. Et justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus.",
									start : "16:50",
									icalStart : "20161005T145000Z",
									icalEnd : "20161005T151500Z",
									authors : [
										{
											name : "Tempor Ut"
										},
										{
											name : "Est Lorem"
										},
										{
											name : "Sit Sadipscing"
										},
										{
											name : "Et Eos"
										},
										{
											name : "Voluptua Voluptua"
										},
										{
											name : "Diam Diam"
										},
										{
											name : "Et Invidunt"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161005T140000Z",
					icalEnd : "20161005T153000Z",
					room : "Lamennais 4+5",
					events : [
						{
							type : "TalkSession",
							title : "Eos et accusam et justo duo dolores et ea rebum stet clita kasd gubergren no",
							chair : "Consetetur Erat",
							papers : [
								{
									title : "Clita kasd gubergren no sea",
									abstract : "Vero eos et accusam et justo duo dolores et ea rebum stet clita kasd gubergren Ipsum dolor sit amet lorem. Consetetur sadipscing elitr sed diam nonumy eirmod tempor. Dolor sit amet lorem ipsum dolor sit amet. Aliquyam erat sed diam voluptua. Dolor sit amet consetetur sadipscing. Rebum stet clita kasd gubergren no sea takimata sanctus est. Et dolore magna aliquyam erat. Gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit. Lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing.",
									start : "16:00",
									icalStart : "20161005T140000Z",
									icalEnd : "20161005T142500Z",
									authors : [
										{
											name : "Nonumy Dolore"
										},
										{
											name : "At No"
										},
										{
											name : "Rebum Nonumy"
										},
										{
											name : "Nonumy Sed"
										}
									]
								},
								{
									title : "Rebum stet clita kasd gubergren no sea takimata",
									abstract : "Tempor invidunt ut labore et Et justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata. Sed diam voluptua at vero eos et accusam et justo duo dolores et ea rebum. Justo duo dolores et ea. Magna aliquyam erat sed diam. Voluptua at vero eos et. Takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing. Magna aliquyam erat sed diam. Vero eos et accusam et justo duo dolores. Sed diam voluptua at vero. Eirmod tempor invidunt ut labore et dolore magna aliquyam erat. Amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam.",
									start : "16:25",
									icalStart : "20161005T142500Z",
									icalEnd : "20161005T145000Z",
									authors : [
										{
											name : "Eos Sed"
										},
										{
											name : "Magna Takimata"
										},
										{
											name : "Takimata Ea"
										},
										{
											name : "Nonumy Sed"
										},
										{
											name : "Eos Et"
										},
										{
											name : "Amet At"
										},
										{
											name : "Duo Accusam"
										}
									]
								},
								{
									title : "Kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit",
									abstract : "Takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor Kasd gubergren no sea takimata sanctus. Duo dolores et ea rebum. Nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at. Lorem ipsum dolor sit amet lorem ipsum dolor sit. Clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum. Est lorem ipsum dolor sit. Lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut.",
									start : "16:50",
									icalStart : "20161005T145000Z",
									icalEnd : "20161005T151500Z",
									authors : [
										{
											name : "Et Sadipscing"
										},
										{
											name : "Ipsum Invidunt"
										},
										{
											name : "Nonumy Ea"
										},
										{
											name : "Duo Gubergren"
										},
										{
											name : "Diam Sit"
										}
									]
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
					start : "17:30",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "17:30",
					end : "19:00",
					rowSpan : 6,
					icalStart : "20161005T153000Z",
					icalEnd : "20161005T170000Z",
					room : "Lamennais 4+5",
					events : [
						{
							type : "Meeting",
							title : "SC Meeting"
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
					start : "19:00",
					rowSpan : 4
				},
				{
					rowSpan : 4
				},
				{
					rowSpan : 4
				},
				{
					rowSpan : 4
				},
				{
					rowSpan : 4
				},
				{
					rowSpan : 4
				},
				{
					rowSpan : 4
				}
			],
			[],
			[],
			[],
			[
				{
					start : "20:00",
					rowSpan : 8
				},
				{
					start : "20:00",
					end : "22:00",
					rowSpan : 8,
					icalStart : "20161005T180000Z",
					icalEnd : "20161005T200000Z",
					room : "Rotonde Surcouf",
					events : [
						{
							type : "SRC",
							title : "SRC Awards"
						}
					]
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				},
				{
					rowSpan : 8
				}
			],
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
		name : "Thursday",
		date : "20161006",
		rooms : [
			{
				name : "Rotonde J. Cartier"
			},
			{
				name : "Grand Large"
			},
			{
				name : "Chateaubriand",
				capacity : "400"
			},
			{
				name : "Lamennais 1+2",
				capacity : "180"
			},
			{
				name : "Lamennais 4+5",
				capacity : "150"
			}
		],
		sessionGroups : [
			[
				{
					start : "09:00",
					rowSpan : 6
				},
				{
					start : "09:00",
					end : "12:30",
					rowSpan : 14,
					icalStart : "20161006T070000Z",
					icalEnd : "20161006T103000Z",
					room : "Rotonde J. Cartier",
					events : [
						{
							type : "Clinic",
							title : "Clinic"
						}
					]
				},
				{
					rowSpan : 6
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161006T070000Z",
					icalEnd : "20161006T083000Z",
					room : "Chateaubriand",
					events : [
						{
							type : "Keynote",
							title : "Keynote 2"
						}
					]
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					start : "10:30",
					rowSpan : 2
				},
				{
					start : "10:30",
					end : "11:00",
					rowSpan : 2,
					icalStart : "20161006T083000Z",
					icalEnd : "20161006T090000Z",
					room : "Grand Large",
					events : [
						{
							type : "Poster",
							title : "Poster"
						}
					]
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				}
			],
			[],
			[
				{
					start : "11:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161006T090000Z",
					icalEnd : "20161006T103000Z",
					room : "Chateaubriand",
					events : [
						{
							type : "TalkSession",
							title : "Invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero",
							chair : "Stet No",
							papers : [
								{
									title : "Tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at",
									abstract : "Sit amet consetetur sadipscing elitr Voluptua at vero eos et accusam et justo duo dolores et ea rebum stet clita. Lorem ipsum dolor sit amet consetetur sadipscing elitr sed. Magna aliquyam erat sed diam. Aliquyam erat sed diam voluptua at vero eos et accusam et justo duo dolores et. Diam voluptua at vero eos. Justo duo dolores et ea rebum stet clita kasd. Dolores et ea rebum stet clita kasd gubergren no sea.",
									start : "11:00",
									icalStart : "20161006T090000Z",
									icalEnd : "20161006T092500Z",
									authors : [
										{
											name : "Lorem Lorem"
										},
										{
											name : "Diam Et"
										},
										{
											name : "Dolores Et"
										},
										{
											name : "Lorem Sit"
										},
										{
											name : "Ipsum Invidunt"
										},
										{
											name : "Accusam Ipsum"
										},
										{
											name : "Clita Tempor"
										}
									]
								},
								{
									title : "Diam nonumy eirmod tempor invidunt",
									abstract : "Lorem ipsum dolor sit amet lorem ipsum dolor Kasd gubergren no sea takimata. Voluptua at vero eos et accusam. Et dolore magna aliquyam erat sed diam voluptua at vero. Ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit. Sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur. Diam voluptua at vero eos. Consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam.",
									start : "11:25",
									icalStart : "20161006T092500Z",
									icalEnd : "20161006T095000Z",
									authors : [
										{
											name : "Sed Kasd"
										},
										{
											name : "Nonumy At"
										},
										{
											name : "Rebum Sadipscing"
										},
										{
											name : "Consetetur Erat"
										}
									]
								},
								{
									title : "Labore et dolore magna aliquyam erat sed diam voluptua",
									abstract : "Lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut Et justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus. Et dolore magna aliquyam erat. Duo dolores et ea rebum. Sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr. Sit amet consetetur sadipscing elitr. Et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam. Dolor sit amet consetetur sadipscing. Dolore magna aliquyam erat sed. Lorem ipsum dolor sit amet consetetur.",
									start : "11:50",
									icalStart : "20161006T095000Z",
									icalEnd : "20161006T101500Z",
									authors : [
										{
											name : "Diam Diam"
										},
										{
											name : "Invidunt At"
										},
										{
											name : "Aliquyam Et"
										},
										{
											name : "Est Lorem"
										},
										{
											name : "Est Et"
										},
										{
											name : "Clita Tempor"
										},
										{
											name : "Et Sadipscing"
										},
										{
											name : "Kasd Dolores"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161006T090000Z",
					icalEnd : "20161006T103000Z",
					room : "Lamennais 1+2",
					events : [
						{
							type : "TalkSession",
							title : "Kasd gubergren no sea takimata",
							chair : "Gubergren Duo",
							papers : [
								{
									title : "Et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et justo",
									abstract : "Et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum Lorem ipsum dolor sit amet. Eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua. Vero eos et accusam et. Lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut. Diam voluptua at vero eos. Kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor. Diam voluptua at vero eos et accusam et justo duo dolores et ea rebum stet. Eirmod tempor invidunt ut labore. Vero eos et accusam et. Kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor.",
									start : "11:00",
									icalStart : "20161006T090000Z",
									icalEnd : "20161006T092500Z",
									authors : [
										{
											name : "Invidunt At"
										},
										{
											name : "Sed Sea"
										}
									]
								},
								{
									title : "Invidunt ut labore et dolore",
									abstract : "Consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut Takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing. Et ea rebum stet clita. Dolores et ea rebum stet. Sadipscing elitr sed diam nonumy. Magna aliquyam erat sed diam. Dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam. Eos et accusam et justo duo dolores et ea rebum stet clita kasd gubergren no. Stet clita kasd gubergren no sea takimata sanctus.",
									start : "11:25",
									icalStart : "20161006T092500Z",
									icalEnd : "20161006T095000Z",
									authors : [
										{
											name : "Lorem Sit"
										},
										{
											name : "Dolores Et"
										},
										{
											name : "Aliquyam Et"
										},
										{
											name : "Takimata Et"
										},
										{
											name : "Kasd Dolores"
										},
										{
											name : "Duo Nonumy"
										},
										{
											name : "Amet Sed"
										},
										{
											name : "Invidunt Amet"
										}
									]
								},
								{
									title : "Eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero",
									abstract : "Consetetur sadipscing elitr sed diam Ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy. Et justo duo dolores et ea rebum stet clita kasd gubergren. Clita kasd gubergren no sea. Est lorem ipsum dolor sit amet lorem ipsum. Diam nonumy eirmod tempor invidunt. Ea rebum stet clita kasd. Accusam et justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata.",
									start : "11:50",
									icalStart : "20161006T095000Z",
									icalEnd : "20161006T101500Z",
									authors : [
										{
											name : "Gubergren Ea"
										},
										{
											name : "Et Invidunt"
										},
										{
											name : "Stet No"
										},
										{
											name : "Et Dolor"
										},
										{
											name : "Amet At"
										},
										{
											name : "Magna Labore"
										},
										{
											name : "Dolor Eirmod"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161006T090000Z",
					icalEnd : "20161006T103000Z",
					room : "Lamennais 4+5",
					events : [
						{
							type : "TalkSession",
							title : "Et accusam et justo duo",
							chair : "Gubergren Ea",
							papers : [
								{
									title : "Stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem",
									abstract : "Eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero Sed diam voluptua at vero. Et ea rebum stet clita kasd. Aliquyam erat sed diam voluptua. Lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam. Stet clita kasd gubergren no sea takimata sanctus est. Tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at. Erat sed diam voluptua at vero eos et accusam et justo duo dolores et ea.",
									start : "11:00",
									icalStart : "20161006T090000Z",
									icalEnd : "20161006T092500Z",
									authors : [
										{
											name : "Amet At"
										},
										{
											name : "Consetetur Erat"
										},
										{
											name : "Diam Diam"
										},
										{
											name : "Rebum Nonumy"
										},
										{
											name : "Consetetur Ipsum"
										},
										{
											name : "Sadipscing Ipsum"
										}
									]
								},
								{
									title : "Takimata sanctus est lorem ipsum dolor sit",
									abstract : "Kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor Vero eos et accusam et justo duo dolores. Justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus. Duo dolores et ea rebum stet clita kasd gubergren no. Amet lorem ipsum dolor sit amet. Et ea rebum stet clita. Sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor. Kasd gubergren no sea takimata sanctus. Tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos. Sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur.",
									start : "11:25",
									icalStart : "20161006T092500Z",
									icalEnd : "20161006T095000Z",
									authors : [
										{
											name : "Et Sadipscing"
										},
										{
											name : "Sed Kasd"
										},
										{
											name : "Labore Sed"
										},
										{
											name : "Diam Et"
										},
										{
											name : "Nonumy Dolore"
										},
										{
											name : "Lorem No"
										}
									]
								},
								{
									title : "Aliquyam erat sed diam voluptua",
									abstract : "Ipsum dolor sit amet consetetur sadipscing elitr sed diam Dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod. Sed diam voluptua at vero eos et accusam et justo duo dolores et ea rebum. Dolor sit amet lorem ipsum. Ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy. Labore et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et. Est lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed. Consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore. Takimata sanctus est lorem ipsum.",
									start : "11:50",
									icalStart : "20161006T095000Z",
									icalEnd : "20161006T101500Z",
									authors : [
										{
											name : "Ipsum Invidunt"
										},
										{
											name : "Dolores Justo"
										},
										{
											name : "Dolores Eirmod"
										},
										{
											name : "Takimata Et"
										}
									]
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
					start : "12:30",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "12:30",
					end : "14:00",
					rowSpan : 6,
					icalStart : "20161006T103000Z",
					icalEnd : "20161006T120000Z",
					room : "Grand Large",
					events : [
						{
							type : "Lunch",
							title : "Lunch"
						}
					]
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					start : "14:00",
					rowSpan : 6
				},
				{
					start : "14:00",
					end : "17:30",
					rowSpan : 14,
					icalStart : "20161006T120000Z",
					icalEnd : "20161006T153000Z",
					room : "Rotonde J. Cartier",
					events : [
						{
							type : "Clinic",
							title : "Clinic"
						}
					]
				},
				{
					rowSpan : 6
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161006T120000Z",
					icalEnd : "20161006T133000Z",
					room : "Chateaubriand",
					events : [
						{
							type : "TalkSession",
							title : "Kasd gubergren no sea takimata sanctus",
							chair : "Amet Sit",
							papers : [
								{
									title : "Et accusam et justo duo",
									abstract : "Dolor sit amet lorem ipsum Labore et dolore magna aliquyam erat sed diam voluptua at vero. Et accusam et justo duo. Justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus est. Dolor sit amet consetetur sadipscing. At vero eos et accusam et justo duo dolores. Aliquyam erat sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum stet. Tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos.",
									start : "14:00",
									icalStart : "20161006T120000Z",
									icalEnd : "20161006T122500Z",
									authors : [
										{
											name : "Gubergren At"
										},
										{
											name : "Accusam Ipsum"
										},
										{
											name : "Consetetur Erat"
										},
										{
											name : "At No"
										},
										{
											name : "Accusam Vero"
										},
										{
											name : "Clita Tempor"
										},
										{
											name : "Lorem At"
										},
										{
											name : "Magna Labore"
										}
									]
								},
								{
									title : "Amet consetetur sadipscing elitr sed",
									abstract : "Sed diam voluptua at vero eos et accusam et justo duo dolores et ea rebum Labore et dolore magna aliquyam erat sed diam voluptua at vero. Et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor. Aliquyam erat sed diam voluptua. Elitr sed diam nonumy eirmod tempor invidunt ut labore et. Sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat. Diam nonumy eirmod tempor invidunt. Et ea rebum stet clita. Invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos et. Diam voluptua at vero eos et accusam et justo duo dolores et ea rebum stet.",
									start : "14:25",
									icalStart : "20161006T122500Z",
									icalEnd : "20161006T125000Z",
									authors : [
										{
											name : "Kasd Sanctus"
										},
										{
											name : "Gubergren Consetetur"
										},
										{
											name : "Invidunt Nonumy"
										},
										{
											name : "Et Eos"
										},
										{
											name : "Vero Et"
										},
										{
											name : "Ipsum Magna"
										}
									]
								},
								{
									title : "Accusam et justo duo dolores et ea rebum stet",
									abstract : "Sed diam voluptua at vero eos et accusam et justo Diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua. Sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat. Gubergren no sea takimata sanctus. Et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et justo. Dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et justo duo. Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet. Et ea rebum stet clita. Tempor invidunt ut labore et dolore magna aliquyam erat sed. Sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat.",
									start : "14:50",
									icalStart : "20161006T125000Z",
									icalEnd : "20161006T131500Z",
									authors : [
										{
											name : "Dolores Et"
										},
										{
											name : "Accusam Vero"
										},
										{
											name : "Ipsum Magna"
										},
										{
											name : "Stet No"
										},
										{
											name : "Duo Nonumy"
										},
										{
											name : "Consetetur Erat"
										},
										{
											name : "Ea Diam"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161006T120000Z",
					icalEnd : "20161006T133000Z",
					room : "Lamennais 1+2",
					events : [
						{
							type : "TalkSession",
							title : "Ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr",
							chair : "Voluptua Voluptua",
							papers : [
								{
									title : "Voluptua at vero eos et accusam et justo duo dolores et",
									abstract : "Sit amet lorem ipsum dolor sit Erat sed diam voluptua at vero eos et accusam et justo duo. No sea takimata sanctus est. Ipsum dolor sit amet lorem. Sadipscing elitr sed diam nonumy. Et justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus. Ipsum dolor sit amet consetetur. Ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit. Diam voluptua at vero eos. Dolore magna aliquyam erat sed diam. Lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam. Et accusam et justo duo dolores et ea rebum stet clita kasd gubergren no sea.",
									start : "14:00",
									icalStart : "20161006T120000Z",
									icalEnd : "20161006T122500Z",
									authors : [
										{
											name : "Tempor Ea"
										},
										{
											name : "Voluptua Voluptua"
										},
										{
											name : "No Aliquyam"
										},
										{
											name : "Dolor Eirmod"
										},
										{
											name : "Sadipscing Ipsum"
										},
										{
											name : "Sed Sea"
										},
										{
											name : "Lorem Diam"
										}
									]
								},
								{
									title : "Aliquyam erat sed diam voluptua at vero eos et accusam et justo duo dolores et",
									abstract : "Rebum stet clita kasd gubergren no sea takimata sanctus Eos et accusam et justo duo dolores et ea rebum stet clita kasd gubergren no. Ea rebum stet clita kasd gubergren no sea. Sed diam voluptua at vero eos. Dolore magna aliquyam erat sed. Sed diam voluptua at vero eos et accusam et justo duo dolores et ea rebum. Rebum stet clita kasd gubergren no sea takimata sanctus. Lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam. Est lorem ipsum dolor sit.",
									start : "14:25",
									icalStart : "20161006T122500Z",
									icalEnd : "20161006T125000Z",
									authors : [
										{
											name : "Vero Justo"
										},
										{
											name : "Gubergren Duo"
										},
										{
											name : "Voluptua Dolore"
										},
										{
											name : "Et Diam"
										},
										{
											name : "Gubergren Consetetur"
										},
										{
											name : "Voluptua Gubergren"
										}
									]
								},
								{
									title : "Tempor invidunt ut labore et dolore magna aliquyam erat sed",
									abstract : "Elitr sed diam nonumy eirmod tempor Et ea rebum stet clita. Ut labore et dolore magna aliquyam erat. At vero eos et accusam. Stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem. Voluptua at vero eos et. Amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna. Stet clita kasd gubergren no. Sit amet consetetur sadipscing elitr sed diam nonumy.",
									start : "14:50",
									icalStart : "20161006T125000Z",
									icalEnd : "20161006T131500Z",
									authors : [
										{
											name : "Nonumy Ea"
										},
										{
											name : "Vero Clita"
										},
										{
											name : "Lorem No"
										},
										{
											name : "Invidunt Amet"
										},
										{
											name : "No Aliquyam"
										},
										{
											name : "Lorem Lorem"
										},
										{
											name : "Amet At"
										},
										{
											name : "Lorem Lorem"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "14:00",
					end : "15:30",
					rowSpan : 6,
					icalStart : "20161006T120000Z",
					icalEnd : "20161006T133000Z",
					room : "Lamennais 4+5",
					events : [
						{
							type : "TalkSession",
							title : "Sit amet lorem ipsum dolor",
							chair : "Clita Clita",
							papers : [
								{
									title : "Dolore magna aliquyam erat sed",
									abstract : "Sadipscing elitr sed diam nonumy eirmod tempor Rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet. Stet clita kasd gubergren no. Diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed. Sea takimata sanctus est lorem. Lorem ipsum dolor sit amet. Eos et accusam et justo duo dolores et ea rebum stet clita kasd gubergren no. Duo dolores et ea rebum stet clita.",
									start : "14:00",
									icalStart : "20161006T120000Z",
									icalEnd : "20161006T122500Z",
									authors : [
										{
											name : "Labore Sed"
										},
										{
											name : "Clita Tempor"
										}
									]
								},
								{
									title : "Sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod",
									abstract : "Rebum stet clita kasd gubergren Dolor sit amet consetetur sadipscing elitr. Dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et justo duo. Dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr. Amet consetetur sadipscing elitr sed. Accusam et justo duo dolores et ea rebum stet clita kasd gubergren no. Sanctus est lorem ipsum dolor sit amet. Ut labore et dolore magna. Takimata sanctus est lorem ipsum. Sanctus est lorem ipsum dolor.",
									start : "14:25",
									icalStart : "20161006T122500Z",
									icalEnd : "20161006T125000Z",
									authors : [
										{
											name : "At No"
										},
										{
											name : "Stet Justo"
										},
										{
											name : "Est Et"
										},
										{
											name : "Lorem Sit"
										},
										{
											name : "Eos Et"
										}
									]
								},
								{
									title : "Et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et justo",
									abstract : "Et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum Lorem ipsum dolor sit amet. Eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua. Vero eos et accusam et. Lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut. Diam voluptua at vero eos. Kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor. Diam voluptua at vero eos et accusam et justo duo dolores et ea rebum stet. Eirmod tempor invidunt ut labore. Vero eos et accusam et. Kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor.",
									start : "14:50",
									icalStart : "20161006T125000Z",
									icalEnd : "20161006T131500Z",
									authors : [
										{
											name : "Invidunt At"
										},
										{
											name : "Sed Sea"
										}
									]
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
					start : "15:30",
					rowSpan : 2
				},
				{
					start : "15:30",
					end : "16:00",
					rowSpan : 2,
					icalStart : "20161006T133000Z",
					icalEnd : "20161006T140000Z",
					room : "Grand Large",
					events : [
						{
							type : "Poster",
							title : "Poster"
						}
					]
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				}
			],
			[],
			[
				{
					start : "16:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161006T140000Z",
					icalEnd : "20161006T153000Z",
					room : "Chateaubriand",
					events : [
						{
							type : "TalkSession",
							title : "Dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem",
							chair : "Duo Nonumy",
							papers : [
								{
									title : "Ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam",
									abstract : "Diam nonumy eirmod tempor invidunt Erat sed diam voluptua at vero eos et accusam et justo duo dolores et ea. Justo duo dolores et ea rebum stet clita kasd gubergren. Takimata sanctus est lorem ipsum. Labore et dolore magna aliquyam. At vero eos et accusam. Et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et justo. Accusam et justo duo dolores. Magna aliquyam erat sed diam.",
									start : "16:00",
									icalStart : "20161006T140000Z",
									icalEnd : "20161006T142500Z",
									authors : [
										{
											name : "Voluptua Dolore"
										},
										{
											name : "Invidunt Nonumy"
										},
										{
											name : "Ipsum Invidunt"
										},
										{
											name : "Aliquyam Ipsum"
										},
										{
											name : "Vero Justo"
										},
										{
											name : "Nonumy Sed"
										},
										{
											name : "Stet No"
										},
										{
											name : "Amet At"
										}
									]
								},
								{
									title : "Amet consetetur sadipscing elitr sed",
									abstract : "Sed diam voluptua at vero eos et accusam et justo duo dolores et ea rebum Labore et dolore magna aliquyam erat sed diam voluptua at vero. Et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor. Aliquyam erat sed diam voluptua. Elitr sed diam nonumy eirmod tempor invidunt ut labore et. Sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat. Diam nonumy eirmod tempor invidunt. Et ea rebum stet clita. Invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos et. Diam voluptua at vero eos et accusam et justo duo dolores et ea rebum stet.",
									start : "16:25",
									icalStart : "20161006T142500Z",
									icalEnd : "20161006T145000Z",
									authors : [
										{
											name : "Kasd Sanctus"
										},
										{
											name : "Gubergren Consetetur"
										},
										{
											name : "Invidunt Nonumy"
										},
										{
											name : "Et Eos"
										},
										{
											name : "Vero Et"
										},
										{
											name : "Ipsum Magna"
										}
									]
								},
								{
									title : "Ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit",
									abstract : "Lorem ipsum dolor sit amet consetetur sadipscing elitr Eos et accusam et justo. Stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem. Labore et dolore magna aliquyam erat sed diam voluptua at. Stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet. Labore et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et. Nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed. Lorem ipsum dolor sit amet. Ut labore et dolore magna aliquyam erat sed. Ut labore et dolore magna.",
									start : "16:50",
									icalStart : "20161006T145000Z",
									icalEnd : "20161006T151500Z",
									authors : [
										{
											name : "Magna Dolore"
										},
										{
											name : "Magna Labore"
										},
										{
											name : "Sit Sadipscing"
										},
										{
											name : "Eos Et"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161006T140000Z",
					icalEnd : "20161006T153000Z",
					room : "Lamennais 1+2",
					events : [
						{
							type : "TalkSession",
							title : "Rebum stet clita kasd gubergren",
							chair : "Lorem Diam",
							papers : [
								{
									title : "Rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit",
									abstract : "Erat sed diam voluptua at vero eos et accusam et Elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed. Dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy. Voluptua at vero eos et accusam et justo duo dolores et ea rebum stet clita. Dolor sit amet lorem ipsum. Et ea rebum stet clita. Amet lorem ipsum dolor sit amet consetetur sadipscing. Elitr sed diam nonumy eirmod tempor invidunt ut. Amet consetetur sadipscing elitr sed. Invidunt ut labore et dolore.",
									start : "16:00",
									icalStart : "20161006T140000Z",
									icalEnd : "20161006T142500Z",
									authors : [
										{
											name : "Gubergren Consetetur"
										},
										{
											name : "Labore Sed"
										},
										{
											name : "Voluptua Voluptua"
										},
										{
											name : "Diam Et"
										},
										{
											name : "Ipsum Invidunt"
										},
										{
											name : "Ipsum Magna"
										},
										{
											name : "Ipsum Magna"
										}
									]
								},
								{
									title : "Ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit",
									abstract : "Lorem ipsum dolor sit amet consetetur sadipscing elitr Eos et accusam et justo. Stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem. Labore et dolore magna aliquyam erat sed diam voluptua at. Stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet. Labore et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et. Nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed. Lorem ipsum dolor sit amet. Ut labore et dolore magna aliquyam erat sed. Ut labore et dolore magna.",
									start : "16:25",
									icalStart : "20161006T142500Z",
									icalEnd : "20161006T145000Z",
									authors : [
										{
											name : "Magna Dolore"
										},
										{
											name : "Magna Labore"
										},
										{
											name : "Sit Sadipscing"
										},
										{
											name : "Eos Et"
										}
									]
								},
								{
									title : "Sanctus est lorem ipsum dolor sit amet lorem ipsum",
									abstract : "Voluptua at vero eos et accusam et justo duo dolores At vero eos et accusam et justo. Elitr sed diam nonumy eirmod tempor invidunt ut. Dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum. Consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore. Stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem. At vero eos et accusam et justo duo dolores et ea rebum stet clita kasd. Ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy.",
									start : "16:50",
									icalStart : "20161006T145000Z",
									icalEnd : "20161006T151500Z",
									authors : [
										{
											name : "At No"
										},
										{
											name : "Sea Amet"
										},
										{
											name : "Amet Sit"
										},
										{
											name : "Diam Et"
										},
										{
											name : "Nonumy Ea"
										},
										{
											name : "Est Et"
										},
										{
											name : "Dolores Justo"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "16:00",
					end : "17:30",
					rowSpan : 6,
					icalStart : "20161006T140000Z",
					icalEnd : "20161006T153000Z",
					room : "Lamennais 4+5",
					events : [
						{
							type : "TalkSession",
							title : "Diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua",
							chair : "Gubergren At",
							papers : [
								{
									title : "No sea takimata sanctus est lorem ipsum",
									abstract : "Duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem Sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet. Accusam et justo duo dolores et ea rebum stet clita kasd gubergren no sea. Dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum. Nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at. Sit amet consetetur sadipscing elitr. Dolores et ea rebum stet clita kasd gubergren no sea. Aliquyam erat sed diam voluptua at vero eos et accusam et justo duo dolores et. Sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed diam. Et accusam et justo duo dolores et ea rebum stet clita kasd gubergren no. Dolore magna aliquyam erat sed. Sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr.",
									start : "16:00",
									icalStart : "20161006T140000Z",
									icalEnd : "20161006T142500Z",
									authors : [
										{
											name : "No Aliquyam"
										},
										{
											name : "Aliquyam Ipsum"
										},
										{
											name : "Amet Et"
										},
										{
											name : "Kasd Dolores"
										},
										{
											name : "Accusam Vero"
										},
										{
											name : "Stet Justo"
										},
										{
											name : "Duo Gubergren"
										}
									]
								},
								{
									title : "No sea takimata sanctus est lorem ipsum dolor sit amet",
									abstract : "Ipsum dolor sit amet lorem ipsum dolor sit amet consetetur Accusam et justo duo dolores et ea rebum stet clita kasd. Kasd gubergren no sea takimata sanctus est. Gubergren no sea takimata sanctus. Amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt. Sit amet consetetur sadipscing elitr. Clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem. No sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet. Erat sed diam voluptua at.",
									start : "16:25",
									icalStart : "20161006T142500Z",
									icalEnd : "20161006T145000Z",
									authors : [
										{
											name : "Stet Est"
										},
										{
											name : "Accusam Ipsum"
										},
										{
											name : "Kasd Sanctus"
										},
										{
											name : "Amet At"
										},
										{
											name : "Consetetur Ipsum"
										},
										{
											name : "Sed Sea"
										}
									]
								},
								{
									title : "Lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam",
									abstract : "Kasd gubergren no sea takimata Sit amet lorem ipsum dolor sit amet consetetur sadipscing. No sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum. Vero eos et accusam et justo duo dolores et ea rebum stet clita. Duo dolores et ea rebum. Amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut. Lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam. Et justo duo dolores et. Sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum. Lorem ipsum dolor sit amet lorem ipsum.",
									start : "16:50",
									icalStart : "20161006T145000Z",
									icalEnd : "20161006T151500Z",
									authors : [
										{
											name : "Amet Sed"
										},
										{
											name : "Dolor No"
										},
										{
											name : "Aliquyam Ipsum"
										},
										{
											name : "Magna Takimata"
										}
									]
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
					start : "17:30",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "17:30",
					end : "19:00",
					rowSpan : 6,
					icalStart : "20161006T153000Z",
					icalEnd : "20161006T170000Z",
					room : "Lamennais 4+5",
					events : [
						{
							type : "Meeting",
							title : "SoSyM Meeting"
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
		name : "Friday",
		date : "20161007",
		rooms : [
			{
				name : "Rotonde J. Cartier"
			},
			{
				name : "Grand Large"
			},
			{
				name : "Chateaubriand",
				capacity : "400"
			},
			{
				name : "Lamennais 1+2",
				capacity : "180"
			},
			{
				name : "Lamennais 4+5",
				capacity : "150"
			}
		],
		sessionGroups : [
			[
				{
					start : "09:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "09:00",
					end : "10:30",
					rowSpan : 6,
					icalStart : "20161007T070000Z",
					icalEnd : "20161007T083000Z",
					room : "Chateaubriand",
					events : [
						{
							type : "Keynote",
							title : "Keynote 3"
						}
					]
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				}
			],
			[],
			[],
			[],
			[],
			[],
			[
				{
					start : "10:30",
					rowSpan : 2
				},
				{
					start : "10:30",
					end : "11:00",
					rowSpan : 2,
					icalStart : "20161007T083000Z",
					icalEnd : "20161007T090000Z",
					room : "Rotonde J. Cartier",
					events : [
						{
							type : "Poster",
							title : "Poster"
						}
					]
				},
				{
					start : "10:30",
					end : "11:00",
					rowSpan : 2,
					icalStart : "20161007T083000Z",
					icalEnd : "20161007T090000Z",
					room : "Grand Large",
					events : [
						{
							type : "CoffeeBreak",
							title : "Coffee Break"
						}
					]
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				},
				{
					rowSpan : 2
				}
			],
			[],
			[
				{
					start : "11:00",
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					rowSpan : 6
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161007T090000Z",
					icalEnd : "20161007T103000Z",
					room : "Chateaubriand",
					events : [
						{
							type : "TalkSession",
							title : "Accusam et justo duo dolores et ea rebum",
							chair : "At Justo",
							papers : [
								{
									title : "Et justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus",
									abstract : "Eirmod tempor invidunt ut labore et dolore magna aliquyam erat sed Voluptua at vero eos et. Aliquyam erat sed diam voluptua at vero eos et accusam et justo duo dolores et. Elitr sed diam nonumy eirmod tempor invidunt ut labore et. Diam nonumy eirmod tempor invidunt. Ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit. Et justo duo dolores et. Clita kasd gubergren no sea takimata sanctus. Erat sed diam voluptua at vero eos et. Et justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus.",
									start : "11:00",
									icalStart : "20161007T090000Z",
									icalEnd : "20161007T092500Z",
									authors : [
										{
											name : "Tempor Ut"
										},
										{
											name : "Est Lorem"
										},
										{
											name : "Sit Sadipscing"
										},
										{
											name : "Et Eos"
										},
										{
											name : "Voluptua Voluptua"
										},
										{
											name : "Diam Diam"
										},
										{
											name : "Et Invidunt"
										}
									]
								},
								{
									title : "Diam voluptua at vero eos et accusam et justo duo dolores et ea rebum stet",
									abstract : "Lorem ipsum dolor sit amet consetetur sadipscing elitr Ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit. Lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam. Vero eos et accusam et. Diam voluptua at vero eos et accusam et justo. Consetetur sadipscing elitr sed diam. Sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit amet. Stet clita kasd gubergren no.",
									start : "11:25",
									icalStart : "20161007T092500Z",
									icalEnd : "20161007T095000Z",
									authors : [
										{
											name : "Ut Accusam"
										},
										{
											name : "Duo Nonumy"
										},
										{
											name : "No Aliquyam"
										},
										{
											name : "Accusam Vero"
										}
									]
								},
								{
									title : "Gubergren no sea takimata sanctus",
									abstract : "Sea takimata sanctus est lorem Lorem ipsum dolor sit amet. Gubergren no sea takimata sanctus est lorem ipsum dolor sit amet. Sed diam voluptua at vero eos et accusam et justo duo dolores et ea rebum. Et justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus. Dolores et ea rebum stet. Dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et. Et dolore magna aliquyam erat. Est lorem ipsum dolor sit amet lorem ipsum. Tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos. Sed diam voluptua at vero eos et accusam et justo duo dolores et ea rebum.",
									start : "11:50",
									icalStart : "20161007T095000Z",
									icalEnd : "20161007T101500Z",
									authors : [
										{
											name : "Consetetur Erat"
										},
										{
											name : "Duo Gubergren"
										},
										{
											name : "Amet Sed"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161007T090000Z",
					icalEnd : "20161007T103000Z",
					room : "Lamennais 1+2",
					events : [
						{
							type : "TalkSession",
							title : "Erat sed diam voluptua at vero eos et accusam et justo duo dolores et ea",
							chair : "Stet Justo",
							papers : [
								{
									title : "Gubergren no sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum dolor sit",
									abstract : "Sit amet consetetur sadipscing elitr Tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at. Stet clita kasd gubergren no. Amet consetetur sadipscing elitr sed. Et ea rebum stet clita kasd gubergren no sea takimata sanctus est. Clita kasd gubergren no sea. Vero eos et accusam et justo duo dolores et ea rebum stet clita kasd gubergren. Sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et.",
									start : "11:00",
									icalStart : "20161007T090000Z",
									icalEnd : "20161007T092500Z",
									authors : [
										{
											name : "Accusam Ipsum"
										},
										{
											name : "Magna Dolore"
										},
										{
											name : "Accusam Ipsum"
										},
										{
											name : "Labore Sed"
										}
									]
								},
								{
									title : "Sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed",
									abstract : "Et accusam et justo duo Amet consetetur sadipscing elitr sed. Invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos et. Clita kasd gubergren no sea. Eirmod tempor invidunt ut labore. Ipsum dolor sit amet consetetur sadipscing elitr sed. Dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed. Et accusam et justo duo. Consetetur sadipscing elitr sed diam.",
									start : "11:25",
									icalStart : "20161007T092500Z",
									icalEnd : "20161007T095000Z",
									authors : [
										{
											name : "Labore Sed"
										},
										{
											name : "Et Eos"
										},
										{
											name : "Stet No"
										}
									]
								},
								{
									title : "Sadipscing elitr sed diam nonumy",
									abstract : "Stet clita kasd gubergren no sea Accusam et justo duo dolores. Sed diam voluptua at vero. Sed diam voluptua at vero eos et accusam et justo duo dolores et ea rebum. Invidunt ut labore et dolore magna aliquyam erat sed diam voluptua at vero eos et. Amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt. Diam nonumy eirmod tempor invidunt. Amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore et dolore magna. At vero eos et accusam et justo duo dolores et ea.",
									start : "11:50",
									icalStart : "20161007T095000Z",
									icalEnd : "20161007T101500Z",
									authors : [
										{
											name : "Dolores Et"
										},
										{
											name : "Vero Et"
										},
										{
											name : "Sed Kasd"
										}
									]
								}
							]
						}
					]
				},
				{
					start : "11:00",
					end : "12:30",
					rowSpan : 6,
					icalStart : "20161007T090000Z",
					icalEnd : "20161007T103000Z",
					room : "Lamennais 4+5",
					events : [
						{
							type : "TalkSession",
							title : "Est lorem ipsum dolor sit amet lorem ipsum dolor sit amet consetetur sadipscing elitr sed",
							chair : "Duo Nonumy",
							papers : [
								{
									title : "Ea rebum stet clita kasd",
									abstract : "Diam voluptua at vero eos et accusam et justo duo dolores et ea rebum stet Dolor sit amet lorem ipsum. Erat sed diam voluptua at. Tempor invidunt ut labore et dolore magna aliquyam erat sed diam voluptua. Labore et dolore magna aliquyam. Et accusam et justo duo dolores et ea rebum stet clita kasd gubergren no sea. Accusam et justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata. Clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor sit. Lorem ipsum dolor sit amet. Elitr sed diam nonumy eirmod. Aliquyam erat sed diam voluptua.",
									start : "11:00",
									icalStart : "20161007T090000Z",
									icalEnd : "20161007T092500Z",
									authors : [
										{
											name : "Est Lorem"
										},
										{
											name : "Tempor Ut"
										},
										{
											name : "Stet Est"
										},
										{
											name : "Ea Nonumy"
										}
									]
								},
								{
									title : "Ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore",
									abstract : "Sed diam voluptua at vero eos et accusam et justo duo dolores Ipsum dolor sit amet lorem ipsum dolor sit amet consetetur. Dolor sit amet consetetur sadipscing. Magna aliquyam erat sed diam. Aliquyam erat sed diam voluptua. Dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut. Sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut. Et ea rebum stet clita kasd gubergren no sea takimata sanctus est lorem ipsum dolor. No sea takimata sanctus est lorem ipsum dolor sit amet lorem ipsum. Labore et dolore magna aliquyam erat sed diam voluptua at vero eos et accusam et.",
									start : "11:25",
									icalStart : "20161007T092500Z",
									icalEnd : "20161007T095000Z",
									authors : [
										{
											name : "Nonumy At"
										},
										{
											name : "Gubergren At"
										},
										{
											name : "Ea Diam"
										},
										{
											name : "Et Diam"
										},
										{
											name : "At Justo"
										},
										{
											name : "No Aliquyam"
										},
										{
											name : "Tempor Et"
										}
									]
								},
								{
									title : "Dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod",
									abstract : "Et justo duo dolores et ea rebum stet clita kasd gubergren no sea takimata sanctus Et accusam et justo duo. Dolor sit amet consetetur sadipscing elitr sed. Aliquyam erat sed diam voluptua at vero eos et accusam et justo duo. Ipsum dolor sit amet consetetur sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore. Sed diam nonumy eirmod tempor. Justo duo dolores et ea. Elitr sed diam nonumy eirmod. Sadipscing elitr sed diam nonumy eirmod tempor invidunt ut labore. Aliquyam erat sed diam voluptua at vero eos et.",
									start : "11:50",
									icalStart : "20161007T095000Z",
									icalEnd : "20161007T101500Z",
									authors : [
										{
											name : "Nonumy Accusam"
										},
										{
											name : "Et Et"
										},
										{
											name : "Gubergren At"
										},
										{
											name : "Kasd Sanctus"
										},
										{
											name : "Nonumy Sed"
										},
										{
											name : "Magna Takimata"
										},
										{
											name : "Et Eos"
										},
										{
											name : "Eirmod Consetetur"
										}
									]
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
	}
]
