package org.leandroloureiro.mahabharatagods.services;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/**
 * API to get Available Indian Gods
 */
public interface IndianGodsService {

    /**
     *
     * Get a list of Indian gods.
     *
     * @return a list with Indian gods.
     */
    CompletableFuture<Optional<List<String>>> getGodList();

}
