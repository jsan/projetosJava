<script>
$(document).ready(function(){
	$("#divUser").hide();
	$("#divListUsers").hide();
	$("#bt01").click(function(){
        $("#divUser").toggle();
    });
	$("#bt02").click(function(){
        $("#divListUsers").toggle();
    });

	$("#bt03").click(function(){
        $("#divUser").show();
    });

});
</script>
<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading">
        <span class="lead">User </span>
        <div style="float:right; margin-right: 0px">
			 <!-- input id="bt03" ng-click="ctrl.hello('Reseted')"  value="{{!ctrl.oi ? 'Say Hello' : 'Hide hello'}}" type="button" class="btn btn-info btn-sm"></input -->
			 <input id="bt03" ng-click="ctrl.hello('Reseted')"  value="Say Hello" type="button" class="btn btn-info btn-sm"></input>
			 <button  ng-click="ctrl.resetForm()" type="button" class="btn btn-success btn-sm">Reset Form</button>
        	 <button id="bt01" type="button" class="btn btn-primary btn-sm">Show/Hide</button>
        </div>
        </div>
		<div class="panel-body">
	        <div class="formcontainer" id="divUser">
	            <div class="alert alert-success" role="alert" ng-if="ctrl.oi">{{ctrl.oi.anyMessage}}</div> 
	            <div class="alert alert-success" role="alert" ng-if="ctrl.successMessage">{{ctrl.successMessage}}</div>
	            <div class="alert alert-danger" role="alert"  ng-if="ctrl.errorMessage">{{ctrl.errorMessage}}</div>
	            <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="uname">Name</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.user.name" id="uname" class="username form-control input-sm" placeholder="Enter your name" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>

	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="age">Age</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.user.age" id="age" class="form-control input-sm" placeholder="Enter your Age." required ng-pattern="ctrl.onlyIntegers"/>
	                        </div>
	                    </div>
	                </div>
	
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="salary">Salary</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.user.salary" id="salary" class="form-control input-sm" placeholder="Enter your Salary." required ng-pattern="ctrl.onlyNumbers"/>
	                        </div>
	                    </div>
	                </div>

	                <div class="row">
	                    <div class="form-actions floatRight">
	                        <input type="submit"  value="{{!ctrl.user.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid || myForm.$pristine">
	                        <!-- button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button-->
	                    </div>
	                </div>
	            </form>
    	    </div>
		</div>	
    </div>
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">List of Users </span>
                <div style="float:right; margin-right: 0px">
        	<button id="bt02" type="button" class="btn btn-primary btn-sm">Show/Hide</button>
        </div>
    
        
        </div>
        <div class="panel-heading" id="divListUsers">
                <table class="table table-hover">
		            <thead>
		            <tr>
		                <td class="lead" align=right>Filter Age:</td>
		                <td><input type="text" ng-model="ctrl.user.filterAge" id="filterAge" class="form-control input-sm"  placeholder="Filter Age greater than..." required ng-pattern="ctrl.onlyIntegers"/>
		                </td>
		                <td>
		                <button type="button" ng-click="ctrl.filterUserByAge(!ctrl.user.filterAge ? 1 : ctrl.user.filterAge)" required class="btn btn-success custom-width btn-sm">filter</button>
		                </td>
		            </tr>
		            </thead>
		        </table>		
		<div class="panel-body">
			<div class="table-responsive">
		        <table class="table table-bordered table-hover">
		            <thead>
		            <tr>
		                <th>ID</th>
		                <th>NAME</th>
		                <th>AGE</th>
		                <th>SALARY</th>
		                <th width="100"></th>
		                <th width="100"></th>
		            </tr>
		            </thead>
		            <tbody>
		            <tr ng-repeat="u in ctrl.getAllUsers()">
		                <td>{{u.id}}</td>
		                <td>{{u.name}}</td>
		                <td>{{u.age}}</td>
		                <td>{{u.salary}}</td>
		                <td><button type="button" ng-click="ctrl.editUser(u.id)" class="btn btn-success custom-width btn-xs" >Edit</button></td>
		                <td><button type="button" ng-click="ctrl.removeUser(u.id)" class="btn btn-danger custom-width btn-xs">Remove</button></td>
		            </tr>
		            </tbody>
		        </table>		
			</div>
		</div>
		</div>
    </div>
</div>