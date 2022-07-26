//to begin the project u need to initialise it 
//we use npm to do so 
//use npm init 


//node js has its different modules
//the module which we will be using is called http module it provides us with the functionality to run our server , a server as in  program  which is looking over diff files in our file system . 

const http = require('http');
// const http = require('node:http');

const port = 8000;
//whenevr we write google.com it sends in a request to port no 80 by default and will get some data back to you , similarly any piece of sofware that is running on your system is running on a specific port . port is a logical term instead of physically defined . 

const fs = require('fs');
//why am i declaring a constant , to read this index.js file we need something that can read and write files 
//there is a module built into nodejs which is called fs and is used for reading writing into files 


function requestHandler(req, res) {
    console.log(req.url);
    res.writeHead(200, { 'content-type': 'text/html' });

    // fs.readFile('./index.html', function (err, data) {
    //     //fs is file system , above fs is module (line no 15) 
    //     //readFile is an inbult synchronous function 
    //     //err displayes error and data represents the file data 
    //     if (err) {
    //         console.log('error', err);
    //         return res.end('error')
    //     }
    //     return res.end(data);
    // });//the first arguement it takes is the path of this file we are going to declare 
    // res.end('<h1>gotcha</h1>');

    let filePath;
    switch(req.url){
        case '/':
            filePath = './index.html'
            break;
        case 'profile':
            filePath = './profile.html'
            break;
        default:
            filePath = './404.html'
    }
    fs.readFile(filePath,function(err,data){
        if(err){
            console.log('error',err);
            return res.end('<h1>Errorrr!!</h1>')
        }
    })
}

const server = http.createServer(requestHandler);


server.listen(port, function (err) {
    //when we call server.listen what happens is this this listen is called with port arguement passed through it which corresponds to 8000, if or if does not run this function is called by default 
    if (err) {
        console.log(err);
        return;
    }
    console.log("Server is up and runnign on port lalal ", port);
});


//load balancer is a device that distributes network or application traffic among servers. load balancer improves responsiveness and increases availability of applications . it sits btw the client and the server farm accpeting incming network and application traffic and distribuing the traffic across multple bckend server using varioius methods such as round robin 

//application server is a type of server designed to install , operate and host applications and associated services for end users , it serves and organizations . it facicilates the hosting and delivery of high-end consumer 