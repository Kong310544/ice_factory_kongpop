package nvc.it.ice_factory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.ice_factory.model.Camera;

public interface CameraRepository extends MongoRepository<Camera,String> {
    
}
