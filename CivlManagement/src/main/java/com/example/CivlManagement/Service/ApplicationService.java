package com.example.CivlManagement.Service;

import com.example.CivlManagement.entity.*;
import com.example.CivlManagement.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepository;
    private final ParticipantsRepository participantRepository;
    private final VerificationRepository verificationRepository;
    private final AttachmentRepository attachmentRepository;
    private final PlaceRepository placeRepository;
    private final CostRepository costRepository;

    public ApplicationService(ApplicationRepository applicationRepository, ParticipantsRepository participantRepository,
                              VerificationRepository verificationRepository, AttachmentRepository attachmentRepository,
                              PlaceRepository placeRepository, CostRepository costRepository) {
        this.applicationRepository = applicationRepository;
        this.participantRepository = participantRepository;
        this.verificationRepository = verificationRepository;
        this.attachmentRepository = attachmentRepository;
        this.placeRepository = placeRepository;
        this.costRepository = costRepository;
    }

    public void insert(Application application, List<Participants> participants, Verification verification,
                       List<Attachment> attachments, List<Place> places, List<Cost> costs) {
        // Save the application
        Application savedApplication = applicationRepository.save(application);

        // Save the participants
        participants.forEach(participant -> {
            participant.setApplication(savedApplication);
            participantRepository.save(participant);
        });

        // Save the verification
        verification.setApplication(savedApplication);
        verificationRepository.save(verification);

        // Save the attachments
        attachments.forEach(attachment -> {
            attachment.setApplication(savedApplication);
            attachmentRepository.save(attachment);
        });

        // Save the places
        places.forEach(place -> {
            place.setApplication(savedApplication);
            placeRepository.save(place);
        });

        // Save the costs
        costs.forEach(cost -> {
            cost.setApplication(savedApplication);
            costRepository.save(cost);
        });
    }
}