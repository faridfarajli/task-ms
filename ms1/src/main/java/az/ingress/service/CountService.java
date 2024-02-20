package az.ingress.service;

import az.ingress.entity.Count;
import az.ingress.repo.CountRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountService {
    private final CountRepository countRepository;

    @Transactional
    public String incrementCount() {
        Count count = countRepository.findById(1L).orElseGet(() -> {
            Count newCount = new Count();
            newCount.setId(1L);
            newCount.setCount(0L);
            return countRepository.save(newCount);
        });
        count.setCount(count.getCount() + 1);
        countRepository.save(count);
        return "Hello from ms1 " + count.getCount();
    }
}
