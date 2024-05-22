import axios from "axios";
//import React, { useState } from 'react';
import React, { useEffect, useState } from 'react';

function Api() {
	const [key, setKey] = useState("");
	const [url, setUrl] = useState("http://localhost:8080/api");

	useEffect(() => {
		axios.get(url).then((responce) => {
			setKey(responce.data);
		});
	}, []);
	return (
		<p>
			<div>{key.name}</div>
			<div>{key.distance}</div>
		</p>
	);
}
export default Api;