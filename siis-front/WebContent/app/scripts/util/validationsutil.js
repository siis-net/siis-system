'use strict';

function invalidLegnthArray(array){        
    if (array.length === 0){
        return true;
    }
    return false;
}

function invalidFiled(fieldValue){        
    if (fieldValue === undefined){
        return true;
    }
    return false;
}