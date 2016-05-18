var data = [
	{
		name : "Monday",
		date : "20161007",
		rooms : [
			{
				name : "Vauban 1",
				capacity : "150"
			},
			{
				name : "Vauban 2",
				capacity : "150"
			}
		],
		sessionGroups : [
			[
				{},
				{
					start : "18:00",
					end : "19:00",
					length : "4",
					date : "20161007T180000Z",
					events : [
						{
							type : "Lunch",
							title : "lunch 1"
						},
						{
							type : "Lunch",
							title : "lunch 2"
						}
					]
				}
			],
			[
				{},
				{
					start : "19:00",
					end : "21:00",
					length : "8",
					date : "20161007T190000Z",
					events : [
						{
							type : "Workshop",
							title : "WS-GEMOC",
							organizers : [
								"John Doe",
								"Jane Doe"
							]
						}
					]
				}
			],
			[
				{},
				{
					start : "21:00",
					end : "22:00",
					length : "4",
					date : "20161007T210000Z",
					events : [
						{
							type : "Tutorial",
							title : "Tuto1",
							organizers : [
								"Dorian",
								"fsergb"
							]
						}
					]
				}
			],
			[
				{
					start : "22:00",
					end : "23:00",
					length : "4",
					date : "20161007T220000Z",
					events : [
						{
							type : "Lunch",
							title : "lunch 1"
						}
					]
				},
				{}
			]
		]
	},
	{
		name : "Tuesday",
		date : "20161008",
		rooms : [
			{
				name : "Vauban 2",
				capacity : "150"
			},
			{
				name : "Vauban 3",
				capacity : "150"
			}
		],
		sessionGroups : [
			[
				{},
				{
					start : "19:00",
					end : "21:00",
					length : "8",
					date : "20161008T190000Z",
					events : [
						{
							type : "TalkSession",
							title : "Stuff",
							chair : "John Doe",
							papers : [
								{
									title : "MDE for cows",
									authors : [
										"Jane Doe"
									]
								},
								{
									title : "MDE for pigs",
									authors : [
										"Pierre",
										"Paul",
										"Jacques"
									]
								}
							]
						}
					]
				}
			],
			[
				{
					start : "21:00",
					end : "22:00",
					length : "4",
					date : "20161008T210000Z",
					events : [
						{
							type : "Workshop",
							title : "WS-GEMOC",
							organizers : [
								"John Doe",
								"Jane Doe"
							]
						}
					]
				},
				{}
			]
		]
	}
]
