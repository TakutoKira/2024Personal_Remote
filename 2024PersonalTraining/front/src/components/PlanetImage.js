
import React, { useEffect, useState } from 'react';

function PlanetImage({planetName,distance}) {
	const imagePath = `${process.env.PUBLIC_URL}/${planetName}.png`;
	const styles ={ 
		marginTop: `${parseInt(distance)*200}px`, 
		padding: '16px',
		color: 'white'
	}
	return (
		<div style={styles}>
			<img src={imagePath}></img>
			<h3>{planetName}</h3>
			<p>地球との距離：約{distance * 12756}km（地球{distance}個分）</p>
		</div>
	);
}
export default PlanetImage;