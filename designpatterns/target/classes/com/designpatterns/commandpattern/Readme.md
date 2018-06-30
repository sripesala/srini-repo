#This is command pattern
	User have remote controller, he can switch on or off.Command pattern provides a command for every action, and invoker (user ) can decide to call the central command(remote controller) for the action.

#When to use
	A history of requests is needed
	You need callback functionality
	Requests need to be handled at variant times or in variant orders
	The invoker should be decoupled from the object handling the invocation.
	
#Precaution:
	his pattern ends up forcing a lot of Command classes that will make your design look cluttered - more operations being made possible leads to more command classes. Intelligence required of which Command to use and when leads to possible maintainence issues for the central controller.
