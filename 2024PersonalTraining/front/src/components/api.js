import axios from "axios";
//import React, { useState } from 'react';
import React, { useEffect, useState } from 'react';
import PlanetImage from "./PlanetImage";

function Api() {
	const [key, setKey] = useState("");
	const [url, setUrl] = useState("http://localhost:8080/api");
	const [planets, setPlanets] = useState([]);

	useEffect(() => {
		axios.get(url).then((responce) => {
			setPlanets(responce.data);
		});
	}, []);
	return (

		  		
		<p className="box">
			{planets.map((planet,index) => 

			<PlanetImage key={index} planetName={planet.name} distance={planet.distance}   
			styles={{ marginBottom: `${parseInt(planet.distance)*100}px`, padding: '16px',color: 'white',}}
			>

			</PlanetImage>

			)}
		</p>
	);
}
export default Api;