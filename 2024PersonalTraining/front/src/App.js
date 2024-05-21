import logo from './logo.svg';
import './App.css';

function App() {
	const [key, setKey] = useState("");
	const [url, setUrl] = useState("");
	setKey("null");
	setUrl("localhost://8080/api");
	$.ajax({url}).done(function(obj){
			const txt = Json.stringify(obj,null,' ');
			document.write(txt);

	return (
			<div></div>
  );
export default App;
