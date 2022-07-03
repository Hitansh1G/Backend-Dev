//to begin the project u need to initialise it 
//we use npm to do so 
//use npm init 


//node js has its different modules
//the module which we will be using is called http module it provides us with the functionality to run our server , a server as in  program  which is looking over diff files in our file system . 

const http = require('http');
// const http = require('node:http');

const port = 8000;
//whenevr we write google.com it sends in a request to port no 80 by default and will get some data back to you , similarly any piece of sofware that is running on your system is running on a specific port . port is a logical term instead of physically defined . 
 

function requestHandler(req,res){
    console.log(req.url);
    res.writeHead(200,{'content-type': 'text/html'});
    res.end('<h1>gotcha</h1>');
}

const server = http.createServer(requestHandler);


server.listen(port,function(err){
    //when we call server.listen what happens is this this listen is called with port arguement passed through it which corresponds to 8000, if or if does not run this function is called by default 
    if(err){
        console.log(err);
        return;
    }
    console.log("Server is up and runnign on port ", port);
});


//load balancer is a device that distributes network or application traffic among servers. load balancer improves responsiveness and increases availability of applications . it sits btw the client and the server farm accpeting incming network and application traffic and distribuing the traffic across multple bckend server using varioius methods such as round robin 

//application server is a type of server designed to install , operate and host applications and associated services for end users , it serves and organizations . it facicilates the hosting and delivery of high-end consumer 