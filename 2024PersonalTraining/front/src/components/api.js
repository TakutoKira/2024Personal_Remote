import React, { useState } from 'react';

function Api() {
	const [key, setKey] = useState("");
	const [url, setUrl] = useState("");
	setKey("null");
	setUrl("localhost://8080/api");
	fetch(url,{method:"GET"}).then((res)=>res.json).then((data) => {setKey(data);});
	return (
			<div>{key.name}</div>
  );
  }
export default Api;