package nvc.it.ice_factory.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.ice_factory.model.Camera;
import nvc.it.ice_factory.model.Event;
import nvc.it.ice_factory.repository.CameraRepository;

@Service
public class CameraService {


    @Autowired
    private CameraRepository cameraRepository;

    public List<Camera> getCameras(){
        return cameraRepository.findAll();
    }

    public Optional<Camera> findById(String id){
        return cameraRepository.findById(id);
    }


    public Camera addCamera(Camera camera){
        return cameraRepository.save(camera);
    }

    public Optional<Camera> addEvent(String id, Event event){
        // import old product from ID prodcut
        Camera currentCamera = cameraRepository.findById(id).get();

        event.setCreatedAt(new Date(System.currentTimeMillis()));
        List<Event> events = currentCamera.getEvents();

        events.add(event);

        currentCamera.setEvents(events);

        
        
        return Optional.of(cameraRepository.save(currentCamera));
    }
    
}
