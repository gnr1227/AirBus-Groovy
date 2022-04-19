//import com.airbus.jenkins.pipelines.CustomJob
//import com.airbus.jenkins.pipelines.CustomPipeline

import com.airbus.jenkins.pipelines.* // import all classes from inside this dir.

def job = new CustomJob()
job.start()
def pipeline = new CustomPipeline()
pipeline.init()